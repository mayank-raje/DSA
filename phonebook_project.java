public class phonebook_project {
    
        public static final int max_entry=1000;
            private String[] names;
            private String[] numbers;
            private int size;
            //DEFAULT CONSTRUCTOR
            public phonebook_project(){
                names=new String[max_entry];
                numbers=new String[max_entry];
                size=0;
            }
            //FUNCTIONS
        public void ADDENTERY(String name,String number){
                if (size>=max_entry){
                    System.out.println("phonebook is full");
                }
                else {
                    names[size]=name;
                    numbers[size]=number;
                    size++;
                }
        }
        public String searchnumber(String name){
                for (int i=0;i<size;i++){
                    if (names[i].equalsIgnoreCase(name)){
                        return numbers[i];
                    }
                }
            return "number not found";
        }
        public void printallentries(){
                if (size==0){
                    System.out.println("phone book is empty");
                    return;
                }
            System.out.println("phonebooks entries are");
                for (int i=0;i<size;i++){
                    System.out.println(names[i]+"--->"+numbers[i]);
                }
        }
    
        public static void main(String[] args) {
            phonebook_project p=new phonebook_project();
            p.ADDENTERY("mayank","6261723252");
            System.out.println("phone number of mayank is:"+p.searchnumber("mayank"));
            p.printallentries();
    }
    
    
    }

