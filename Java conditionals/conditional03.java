import java.util.*;
public class conditional03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String smokestatus=sc.nextLine();
        String condition=sc.nextLine();
        String Tier=sc.nextLine();
        System.out.printf("Age: %d\n",age);
        System.out.printf("Smoking Status: %s\n",smokestatus);
        System.out.printf("Pre-existing Conditions: %s\n",condition);
        System.out.printf("Coverage Tier: %s\n",Tier);

        float basepremium=0;
        float risksurcharge=0;
        float totalpremium=0;

        if(age>=18 && age<=30){
            if(Tier.equals("Basic")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=200;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=200;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=200;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=200;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
            else if(Tier.equals("Standard")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=300;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=300;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=300;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=300;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
            else if(Tier.equals("Premium")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=500;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=500;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=500;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=500;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
        }
        else if(age>=31 && age<=50){
            if(Tier.equals("Basic")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=250;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=250;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=250;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=250;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
            else if(Tier.equals("Standard")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=350;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=350;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=350;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=350;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
            else if(Tier.equals("Premium")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=600;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=600;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=600;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=600;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
        }
        else if(age>=51 && age<=65){
            if(Tier.equals("Basic")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=350;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=350;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=350;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=350;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
            else if(Tier.equals("Standard")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=450;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=450;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=450;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=450;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
            else if(Tier.equals("Premium")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=700;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=700;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=700;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=700;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
        }
        else if(age>=66){
            if(Tier.equals("Basic")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=400;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=400;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=400;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=400;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
            else if(Tier.equals("Standard")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=550;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=550;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=550;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=550;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
            else if(Tier.equals("Premium")){
                if(smokestatus.equals("Smoker")&&condition.equals("Yes")){
                    basepremium=800;
                    risksurcharge=(basepremium*70)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("No")){
                    basepremium=800;
                    risksurcharge=0;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Smoker")&&condition.equals("No")){
                    basepremium=800;
                    risksurcharge=(basepremium*40)/100;
                    totalpremium=basepremium+risksurcharge;
                }
                else if(smokestatus.equals("Non-Smoker")&&condition.equals("Yes")){
                    basepremium=800;
                    risksurcharge=(basepremium*30)/100;
                    totalpremium=basepremium+risksurcharge;
                }
            }
        }
        System.out.printf("Base Premium: $%.1f\n",basepremium);
        System.out.printf("Risk Surcharge: $%.1f\n",risksurcharge);
        System.out.printf("Total Monthly Premium: $%.1f\n",totalpremium);
        sc.close();
    }
}
