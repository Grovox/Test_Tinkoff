package Nine;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.lang.*;
import org.json.JSONObject;
import org.json.JSONArray;

class Product{
    private JSONObject product;
    private DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

    public Product(JSONObject product){
        this.product = product;
    }

    public Object getId(){
        return product.get("id");
    }
    public Object getType(){
        return product.get("type");
    }
    public Object getAddressId(){
        return product.get("addressId");
    }
    public Object getClientId(){
        return product.get("clientId");
    }
    public Object getCreationTime(){
        return product.get("creationTime");
    }
    public ZonedDateTime getCreationTimeToDateTime(){
        return ZonedDateTime.parse(product.get("creationTime").toString(), formatter);
    }
    public Object getMeetingTime(){
        return product.get("meetingTime");
    }
    public ZonedDateTime getMeetingTimeToDateTime(){
        return ZonedDateTime.parse(product.get("meetingTime").toString(), formatter);
    }
}

class Products{
    private List<Product> products = new ArrayList<>();

    public Products(JSONArray productsArray){
        for (int i = 0; i < productsArray.length(); i++){
            products.add(new Product(productsArray.getJSONObject(i)));
        }
    }

    public Product getProduct(int index){
        return products.get(index);
    }
    public int getAmountProducts(){
        return products.size();
    }

}

class ProductMeeting{
    private JSONObject productMeeting = new JSONObject();
    private DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

    public ProductMeeting(Product product){
        productMeeting.put("creationTime", product.getCreationTime());
        productMeeting.put("id", product.getId());
        productMeeting.put("type", product.getType());
    }

    public Object getId(){
        return productMeeting.get("id");
    }
    public Object getType(){
        return productMeeting.get("type");
    }
    public ZonedDateTime getCreationTimeToDateTime(){
        return ZonedDateTime.parse(productMeeting.get("creationTime").toString(), formatter);
    }
    public Object getCreationTime(){
        return productMeeting.get("creationTime");
    }
    @Override
    public String toString() {
        return "        {\n" +
                "          \"creationTime\": " + "\"" + getCreationTime() + "\"" + ",\n" +
                "          \"id\": " + "\"" + getId() + "\"" + ",\n" +
                "          \"type\": " + "\"" + getType() + "\"" + "\n" +
                "        }";

    }
}

class Meeting{
    private JSONObject meeting = new JSONObject();
    private DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    private List<ProductMeeting> products = new ArrayList<>();

    public Meeting(Product product) {
        meeting.put("meetingTime", product.getMeetingTime());
        meeting.put("clientId", product.getClientId());
        meeting.put("addressId", product.getAddressId());

        products.add(new ProductMeeting(product));
    }

    public Object getAddressId(){
        return meeting.get("addressId");
    }
    public Object getClientId(){
        return meeting.get("clientId");
    }

    public Object getMeetingTime(){
        return meeting.get("meetingTime");
    }
    public ZonedDateTime getMeetingTimeToDateTime(){
        return ZonedDateTime.parse(meeting.get("meetingTime").toString(), formatter);
    }
    public void setMeetingTime(Object meetingTime){
        meeting.remove("meetingTime");
        meeting.put("meetingTime", meetingTime);
    }
    public ProductMeeting getProduct(int index){
        return products.get(index);
    }

    public boolean checkingProductFromMeeting(Product product){
        if (product.getClientId().equals(getClientId()) && product.getAddressId().equals(getAddressId())) {
            return true;
        }
        return false;
    }
    public void addProduct(Product product){

        if(product.getMeetingTimeToDateTime().isBefore(getMeetingTimeToDateTime())){
            setMeetingTime(product.getMeetingTime());
        }

        for (int i = 0; i < products.size(); i++){
            if(product.getCreationTimeToDateTime().isBefore(getProduct(i).getCreationTimeToDateTime())){
                products.add(i, new ProductMeeting(product));
                return;
            } else if (product.getCreationTimeToDateTime().isEqual(getProduct(i).getCreationTimeToDateTime())) {
                if(getProduct(i).toString().compareToIgnoreCase(product.getId().toString()) > 0){
                    products.add(i, new ProductMeeting(product));

                    return;
                } else if (i + 1 < products.size()){
                    if(!product.getCreationTimeToDateTime().isEqual(getProduct(i + 1).getCreationTimeToDateTime())){
                        products.add(++i, new ProductMeeting(product));

                        return;
                    }else {
                        products.add(new ProductMeeting(product));
                    }
                }
            } else if (i == products.size() - 1) {
                products.add(new ProductMeeting(product));
            }
        }
    }
    @Override
    public String toString() {
        String result = "    {\n" +
        "      \"meetingTime\": " + "\"" + getMeetingTime() + "\"" + ",\n" +
        "      \"clientId\": " + "\"" + getClientId() + "\"" + ",\n" +
        "      \"addressId\": " + "\"" + getAddressId() + "\"" + ",\n" +
        "      \"products\": [" + "\n";
        for (int i = 0; i < products.size(); i++){
            result += products.get(i).toString() + ",\n";
        }
        result = result.substring(0,result.length()-2);
        result += "\n      ]\n" +
        "    }";
        return result;
    }
}

class Meetings{
    private List<Meeting> meetings = new ArrayList<>();

    public Meetings(){}

    public void createMeeting(Product product){
       for (int i = 0; i < meetings.size(); i++){
           if(product.getMeetingTimeToDateTime().isBefore(getMeeting(i).getMeetingTimeToDateTime())){
               meetings.add(i,new Meeting(product));
               return;

           } else if (product.getMeetingTimeToDateTime().equals(getMeeting(i).getMeetingTimeToDateTime())) {

               if(getMeeting(i).getClientId().toString().compareToIgnoreCase(product.getClientId().toString()) > 0){
                   meetings.add(i,new Meeting(product));
                   return;

               } else if (getMeeting(i).getClientId().toString().compareToIgnoreCase(product.getClientId().toString()) == 0) {
                   System.out.println(11111);
                   System.out.println(getMeeting(i).getAddressId().toString().compareToIgnoreCase(product.getAddressId().toString()));
                   if (getMeeting(i).getAddressId().toString().compareToIgnoreCase(product.getAddressId().toString()) > 0){
                        meetings.add(i,new Meeting(product));
                        return;

                   } else if (i + 1 < meetings.size() ){

                       if(!product.getMeetingTimeToDateTime().isEqual(getMeeting(i + 1).getMeetingTimeToDateTime())
                               || (product.getMeetingTimeToDateTime().isEqual(getMeeting(i + 1).getMeetingTimeToDateTime())
                               && getMeeting(i + 1).getClientId().toString().compareToIgnoreCase(product.getClientId().toString()) < 0)) {
                           meetings.add(++i, new Meeting(product));
                           return;
                       }
                   }else {
                       meetings.add(++i, new Meeting(product));
                       return;
                   }
               } else if (i + 1 < meetings.size()) {
                   if(!product.getMeetingTimeToDateTime().isEqual(getMeeting(i + 1).getMeetingTimeToDateTime())) {
                       meetings.add(++i, new Meeting(product));
                       return;
                   } else {
                       meetings.add(++i, new Meeting(product));
                       return;
                   }
               }
           } else if (i == meetings.size() - 1) {
               meetings.add(new Meeting(product));
               return;
           }
       }
       if(meetings.size() == 0){
           meetings.add(new Meeting(product));
       }
    }
    public Meeting getMeeting(int index){
        return meetings.get(index);
    }
    public boolean checkProductFromMeetings(Product product) {
        for (int i = 0; i < meetings.size(); i++) {
            if (getMeeting(i).checkingProductFromMeeting(product)) {
                return true;
            }
        }
        return false;
    }
    public Meeting getMeetingProduct(Product product){
        for (int i = 0; i < meetings.size(); i++) {
        if (getMeeting(i).checkingProductFromMeeting(product)) {
            return meetings.get(i);
        }
    }
        return null;
    }
    @Override
    public String toString() {
        String result;
        result = "{\n" +
                "  \"meetings\": [\n";
        for (int i = 0; i < meetings.size(); i++){
            result += meetings.get(i).toString() + ",\n";
        }
        result = result.substring(0,result.length()-2);
        result += "\n";
        result += "  ]\n" +
                "}\n";
        return result;
    }
}

class PriorityDelivery {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String productsStr = scanner.nextLine();
        JSONArray productsArray = new JSONArray(productsStr.substring(13,productsStr.length() - 1));
        Products products = new Products(productsArray);

        Meetings meetings = new Meetings();

        for(int i = 0; i < products.getAmountProducts(); i++){
            Product product = products.getProduct(i);

            if (meetings.checkProductFromMeetings(product)) {
                meetings.getMeetingProduct(product).addProduct(product);
                System.out.println("Add product to Meeting " + product.getType().toString());
            }else {
                meetings.createMeeting(product);
                System.out.println("new Meeting " + product.getType().toString());
            }
        }
        System.out.println(meetings.toString());
    }
}