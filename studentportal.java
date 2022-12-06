import java.util.Scanner;

public class studentportal {
    
    static int inta,intb,intc,intd,inte;
    static boolean a,b,c,d,f;
    static double user_ict,user_pr,user_philo,user_filipino,user_pe;
    static String user_name,user_section,user_gender,user_address;
    
    static void user_ict_grade(Scanner call_Scanner){
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
                            user_pr_grade(call_Scanner);
                            System.out.println("ICt grade" + user_ict);
                            break eight_bool;
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

    static void user_pr_grade(Scanner call_Scanner){
        do{
            c = false;
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
                            user_philo_grade(call_Scanner);
                            break ten_bool;
                        }
                    }
                }
            }catch(Exception e){
                c = true;
                System.out.println("INVALID INPUT!");
                call_Scanner.next();
            }
        }while(c);
    }

    static void user_philo_grade(Scanner call_Scanner){
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
                            user_filipino_grade(call_Scanner);
                            break twelve_bool;
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

    static void user_filipino_grade(Scanner call_Scanner){
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
                            user_pe_grade(call_Scanner);
                            break fourteen_bool;
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

    static void user_pe_grade(Scanner call_Scanner){
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
                    user_info(call_Scanner);
                }
            }catch(Exception e){
                f = true;
                System.out.println("INVALID INPUT!");
                call_Scanner.next();
                
            }
        }while(f);
    }

    static void user_info(Scanner call_Scanner){
        double user_average = (user_ict + user_pr + user_philo + user_filipino + user_pe)/5;
        System.out.println("ict grade"+ user_ict);
        System.out.println("NAME: "+ user_name);
        System.out.println("SECTION: " + user_section);
        System.out.println("GENDER: " + user_gender);
        System.out.println("ADDRESS: " + user_address);
        System.out.println("GENERAL AVERAGE: " + user_average);
    }
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
                                        //System.out.print("ICT: ");
                                        //double user_ict = call_Scanner.nextDouble();
                                        user_ict_grade(call_Scanner);
                                        break fifth_bool;
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
