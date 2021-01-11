package ExA;

    public class Person {

        private String firstName;
        private String lastName;
        private int age;
        private String street;
        private String nationality;

        public Person(String firstName, String lastName, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {return firstName;}

        public String getLastName() {return lastName;}

        public int getAge() {return age;}

        public String getStreet() {return street;}

        public String getNationality() {return nationality;}

        public void setFirstName(String newFirstName){
            this.firstName = newFirstName;
        }
        public void setLastName(String newLastName){
            this.lastName = newLastName;
        }
        public void setAge(int newAge){
            this.age = newAge;
        }
        public void setStreet(String newStreet){
            this.street = newStreet;
        }
        public void setNationality(String newNationality){
            this.nationality = newNationality;
        }

        @Override
        public String toString(){
            return "O meu nome é " + firstName + " " + lastName + " e tenho " + age + " anos.";
        }
    }


