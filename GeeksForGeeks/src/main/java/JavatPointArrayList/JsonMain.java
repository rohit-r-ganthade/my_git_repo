package JavatPointArrayList;

import com.google.gson.Gson;

/**
 * Created by rohit on 23/12/17.
 */
public class JsonMain {

    public static void main(String args[]){
        String input1 = "{\"userAccount\":null,\"gcmKey\":null,\"userId\":\"940195413\",\"name\":\"Ranin Siver Bird\",\"address\":null,\"phone\":\"+6283893571980023\",\"photograph\":\"http://staging-gojek-bike.imgix.net/go_jek/driver/photograph_image/940195413/574641124648563_19d10980-9633-4449-8f19-4b594f956985_Screenshot_2017-09-15-13-00-42-164_com.gojek.driver.car.staging.png\",\"phoneMake\":\"Xiaomi\",\"phoneModel\":\"Redmi Note 3\",\"phoneIMEI\":\"863408034207333\",\"type\":1,\"status\":1,\"pulsa\":99999736994,\"driverContract\":null,\"token\":\"8ce64f90-2985-4641-ba7d-59f23d622ff1\",\"noPolisi\":\"GG345YTR\",\"vehicleType\":\"bike\",\"serviceArea\":{\"id\":1,\"name\":\"JABODETABEK\",\"code\":\"JBDTB\",\"peakHourAddedFee\":0.00,\"hoursDifference\":0}}";
        Gson gson = new Gson();
        JsonExample example1 = gson.fromJson( input1, JsonExample.class );
        JsonExample example2 = gson.fromJson( input1, JsonExample.class );

        JsonExample example3 = example1;


        if (example1==example3)
            System.out.println("equals");
        else
            System.out.println("le lo ab");

    }

}
