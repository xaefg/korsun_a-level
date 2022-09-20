public class Task1 {
    static class Phone {
        private int number;
        private int weight;
        private String model;
        void recieveCall(String name){
            System.out.println("Calling " + name);
        }
        void getnumber(){
            System.out.println(this.number);
        }


        Phone(int number, int weight, String model) {
            this.number = number;
            this.weight = weight;
            this.model = model;
        }
        Phone(int number, String model) {
            this.number = number;
            this.model = model;
        }
        Phone() {
        }
    }
    public static void print(Phone phone){
        System.out.println(phone.number +" "+phone.weight+" "+phone.model);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(1234,"asdf");
        Phone phone3 = new Phone(1234, 23, "xais");
        print(phone1);
        print(phone2);
        print(phone3);
        phone1.recieveCall("caller name");
        phone2.recieveCall("caller name");
        phone3.recieveCall("caller name");
        phone1.getnumber();
        phone2.getnumber();
        phone3.getnumber();
    }
}
