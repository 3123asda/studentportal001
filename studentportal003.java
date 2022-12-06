import java.util.*;

public class studentportal003 {
    static int inta,intb,intc,intd,inte;
    static boolean a,b,d,f,g;
    static double user_ict,user_pr,user_philo,user_filipino,user_pe,user_average;
    static String user_name,user_section,user_gender,user_address;
    public static void main(String[] args){
        Scanner call_Scanner = new Scanner(System.in);

        try{
            
            first_bool:
            while(true){
                System.out.println("STUDENT PORTAL GRADUATION\n");
                System.out.print("NAME: ");
                user_name = call_Scanner.nextLine().toUpperCase();
                System.out.print("SECTION: ");
                user_section = call_Scanner.nextLine().toUpperCase();
                System.out.print("GENDER: ");
                user_gender = call_Scanner.nextLine().toUpperCase();
                System.out.print("ADDRESS: ");
                user_address = call_Scanner.nextLine().toUpperCase();

                second_bool:
                while(true){
                    third_bool:
                    while(true){
                    System.out.println("STUDENT INFORMATION");    
                    System.out.println("==========================");
                    System.out.println("│NAME:    │" + user_name );
                    System.out.println("│SECTION: │" + user_section );
                    System.out.println("│GENDER:  │" + user_gender );
                    System.out.println("│ADRESS:  │" + user_address );
                    System.out.println("==========================");
                    System.out.print("PRESS C for Confirm,E for Exit and R for re-edit: ");
                    String c = call_Scanner.nextLine().toLowerCase();
                    if (c.equals("c")){
                    System.out.println("STUDENT CREDENTIALS \n");
                    do{
                        a = true;
                        
                        //User input
                        
                            System.out.print("EMAIL: ");
                            String user_email = call_Scanner.next();
                            System.out.print("PASSWORD: ");
                            String user_password = call_Scanner.next();
        
                            //User First Email and Password
                            String[] user_fist_email = {"1"};
                            String[] user_first_password = {"2"};
                            
                            //Check User Input Correct Password
                            if(user_email.equals(user_fist_email[0]) && user_password.equals(user_first_password[0])){
                                System.out.println("Welcome Student \n");
                                System.out.println("Input Your Grade in Specific Subject \n");
                                fourth_bool:
                                while(true){
                                    fifth_bool:
                                    while(true){ 
                                        six_bool:
                                        do{
                                            b = false;
                                            try{
                                                System.out.print("ICT: ");
                                                user_ict = call_Scanner.nextDouble();
                                                if (user_ict >= 101){
                                                System.out.println("Invalid Grade Input! Highest Grade Only 100");
                                                }else if(user_ict <= 69){
                                                System.out.println("Invalid Grade Input! Lowest Grade Only 70");
                                                }else{
                                                    seven_bool:
                                                    while(true){
                                                        eight_bool:
                                                        while(true){
                                                                    do{
                                                                    g = false;
                                                                    try{
                                                                        System.out.print("PR: ");
                                                                        user_pr = call_Scanner.nextDouble();
                                                                        if(user_pr >= 101){
                                                                            System.out.println("Invalid Grade Input! Highest Grade Only 100");
                                                                        }else if(user_pr <= 69){
                                                                            System.out.println("Invalid Grade Input! Lowest Grade Only 70");
                                                                        }else{
                                                                            nine_bool:
                                                                            while(true){
                                                                                ten_bool:
                                                                                while(true){
                                                                                    do{
                                                                                        d = false;
                                                                                        try{
                                                                                            System.out.print("PHILO: ");
                                                                                            user_philo = call_Scanner.nextDouble();
                                                                                            if(user_philo >= 101){
                                                                                                System.out.println("Invalid Grade Input! Highest Grade Only 100");
                                                                                            }else if(user_philo <= 69){
                                                                                                System.out.println("Invalid Grade Input! Lowest Grade Only 70");
                                                                                            }else{
                                                                                                eleven_bool:
                                                                                                while(true){
                                                                                                    twelve_bool:
                                                                                                    while (true) {
                                                                                                        do{
                                                                                                            d = false;
                                                                                                            try{
                                                                                                                System.out.print("FILIPINO: ");
                                                                                                                user_filipino = call_Scanner.nextDouble();
                                                                                                                if(user_filipino >= 101){
                                                                                                                    System.out.println("Invalid Grade Input! Highest Grade Only 100");
                                                                                                                }else if(user_filipino <= 69){
                                                                                                                    System.out.println("Invalid Grade Input! Lowest Grade Only 70");
                                                                                                                }else{
                                                                                                                    thirteen_bool:
                                                                                                                    while (true) {
                                                                                                                        fourteen_bool:
                                                                                                                        while (true){
                                                                                                                            do{
                                                                                                                                f = false;
                                                                                                                                try{
                                                                                                                                    System.out.print("PE: ");
                                                                                                                                    user_pe = call_Scanner.nextDouble();
                                                                                                                                    if(user_pe >= 101){
                                                                                                                                        System.out.println("Invalid Grade Input! Highest Grade Only 100");
                                                                                                                                    }else if(user_pe <= 69){
                                                                                                                                        System.out.println("Invalid Grade Input! Lowest Grade Only 70");
                                                                                                                                    }else{
                                                                                                                                        System.out.println("dasd");
                                                                                                                                        user_average = (user_ict + user_pr + user_philo + user_filipino + user_pe)/5;
                                                                                                                                        System.out.println("NAME: "+ user_name);
                                                                                                                                        System.out.println("SECTION: " + user_section);
                                                                                                                                        System.out.println("GENDER: " + user_gender);
                                                                                                                                        System.out.println("ADDRESS: " + user_address);
                                                                                                                                        System.out.println("GENERAL AVERAGE: " + user_average);

                                                                                                                                        //ICT
                                                                                                                                        System.out.print("ICT: ");
                                                                                                                                        if(user_ict >= 75){
                                                                                                                                            System.out.println("Passed");
                                                                                                                                        }
                                                                                                                                        if(user_ict <= 74){
                                                                                                                                            System.out.println("ICT");
                                                                                                                                        }

                                                                                                                                        //Practical Research
                                                                                                                                        System.out.print("Practical Research: ");
                                                                                                                                        if(user_pr >= 75){
                                                                                                                                            System.out.println("Passed");
                                                                                                                                        }
                                                                                                                                        if(user_pr <= 74){
                                                                                                                                            System.out.println("Practical Research");
                                                                                                                                        }

                                                                                                                                        //Philosophy
                                                                                                                                        System.out.print("Philosophy: ");
                                                                                                                                        if(user_philo >= 75){
                                                                                                                                            System.out.println("Passed");                                                                                                                                            
                                                                                                                                        }
                                                                                                                                        if(user_philo <= 74){
                                                                                                                                            System.out.println("Failed");
                                                                                                                                        }
                                                                                                                                        
                                                                                                                                        //Filipino
                                                                                                                                        System.out.print("Filipino: ");
                                                                                                                                        if(user_filipino >= 75){
                                                                                                                                            System.out.println("Passed");                                                                                                                                            
                                                                                                                                        }
                                                                                                                                        if(user_filipino <= 74){
                                                                                                                                            System.out.println("Failed");
                                                                                                                                        }

                                                                                                                                        //Physical Education
                                                                                                                                        System.out.print("Physical Education: ");
                                                                                                                                        if(user_pe >= 75){
                                                                                                                                            System.out.println("Passed");    
                                                                                                                                        }
                                                                                                                                        if(user_pe <= 74){
                                                                                                                                            System.out.println("Failed");
                                                                                                                                        }
                                                                                                                                        break first_bool;
                                                                                                                                    }
                                                                                                                                }catch(Exception e){
                                                                                                                                    f = true;
                                                                                                                                    System.out.println("INVALID INPUT!");
                                                                                                                                    call_Scanner.next();
                                                                                                                                    
                                                                                                                                }
                                                                                                                            }while(f);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }catch(Exception e){
                                                                                                                d = true;
                                                                                                                System.out.println("INVALID INPUT!");
                                                                                                                call_Scanner.next();
                                                                                                            }
                                                                                                        }while(d);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }catch(Exception e){
                                                                                            d = true;
                                                                                            System.out.println("INVALID INPUT!");
                                                                                            call_Scanner.next();
                                                                                        }
                                                                                    }while(d);
                                                                                }
                                                                            }
                                                                        }
                                                                    }catch(Exception e){
                                                                        g = true;
                                                                        System.out.println("INVALID INPUT!");
                                                                        call_Scanner.next();
                                                                    }
                                                                }while(g);
                                                        }
                                                    }
                                                }
                                            }catch(Exception e){
                                                b = true;
                                                System.out.println("INVALID INPUT!");
                                                call_Scanner.next();
                                            }
                                        }while(b);
                                    }
                        
                                }
                               
        
                            }else if(user_email.equals(user_fist_email[0])){
                                System.out.println("Wrong Password! or Wrong Email! Try again.");
                                
                            }else if(user_password.equals(user_first_password[0])){
                                System.out.println("We don't find that Email.");
                            }
                            else{
                                System.out.println("Invalid Credentials");  
                            }
                    }while(a);
                }else if(c.equals("e")){
                    break first_bool;
                }else if(c.equals("r")){
                    break second_bool;
                }
                else{
                    System.out.println("Invalid Keyword");
                    break third_bool;
                }
                }
                    }
            }    
        }finally{
            call_Scanner.close();
        }
    }
}
