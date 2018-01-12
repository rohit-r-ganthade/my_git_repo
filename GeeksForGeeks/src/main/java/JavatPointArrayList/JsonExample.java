package JavatPointArrayList;

/**
 * Created by rohit on 23/12/17.
 */
public class JsonExample {

    /**
     * userAccount : null
     * gcmKey : null
     * userId : 940195413
     * name : Ranin Siver Bird
     * address : null
     * phone : +6283893571980023
     * photograph : http://staging-gojek-bike.imgix.net/go_jek/driver/photograph_image/940195413/574641124648563_19d10980-9633-4449-8f19-4b594f956985_Screenshot_2017-09-15-13-00-42-164_com.gojek.driver.car.staging.png
     * phoneMake : Xiaomi
     * phoneModel : Redmi Note 3
     * phoneIMEI : 863408034207333
     * type : 1
     * status : 1
     * pulsa : 99999736994
     * driverContract : null
     * token : 8ce64f90-2985-4641-ba7d-59f23d622ff1
     * noPolisi : GG345YTR
     * vehicleType : bike
     * serviceArea : {"id":1,"name":"JABODETABEK","code":"JBDTB","peakHourAddedFee":0,"hoursDifference":0}
     */

    private String userAccount;
    private String gcmKey;
    private String userId;
    private String name;
    private String address;
    private String phone;
    private String photograph;
    private String phoneMake;
    private String phoneModel;
    private String phoneIMEI;
    private int type;
    private int status;
    private long pulsa;
    private String driverContract;
    private String token;
    private String noPolisi;
    private String vehicleType;
    private ServiceAreaBean serviceArea;

    public Object getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Object getGcmKey() {
        return gcmKey;
    }

    public void setGcmKey(String gcmKey) {
        this.gcmKey = gcmKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhotograph() {
        return photograph;
    }

    public void setPhotograph(String photograph) {
        this.photograph = photograph;
    }

    public String getPhoneMake() {
        return phoneMake;
    }

    public void setPhoneMake(String phoneMake) {
        this.phoneMake = phoneMake;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneIMEI() {
        return phoneIMEI;
    }

    public void setPhoneIMEI(String phoneIMEI) {
        this.phoneIMEI = phoneIMEI;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getPulsa() {
        return pulsa;
    }

    public void setPulsa(long pulsa) {
        this.pulsa = pulsa;
    }

    public Object getDriverContract() {
        return driverContract;
    }

    public void setDriverContract(String driverContract) {
        this.driverContract = driverContract;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ServiceAreaBean getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(ServiceAreaBean serviceArea) {
        this.serviceArea = serviceArea;
    }

    public static class ServiceAreaBean {
        /**
         * id : 1
         * name : JABODETABEK
         * code : JBDTB
         * peakHourAddedFee : 0.0
         * hoursDifference : 0
         */

        private int id;
        private String name;
        private String code;
        private double peakHourAddedFee;
        private int hoursDifference;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public double getPeakHourAddedFee() {
            return peakHourAddedFee;
        }

        public void setPeakHourAddedFee(double peakHourAddedFee) {
            this.peakHourAddedFee = peakHourAddedFee;
        }

        public int getHoursDifference() {
            return hoursDifference;
        }

        public void setHoursDifference(int hoursDifference) {
            this.hoursDifference = hoursDifference;
        }


    }
}
