import java.util.*;
public class conditional18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double packageweight=sc.nextDouble();
        sc.nextLine();
        String destinationzone=sc.nextLine();
        String shippingspeed=sc.nextLine();
        String packagesize=sc.nextLine();

        double baseshippingrate=0;
        double sizesurcharge=0;
        double zonemultiplier=0;
        String servicelevel="0";
        double basecost=0;
        double totalcost=0;
        int estimateddelivery=0;

        if(shippingspeed.equals("Economy")){
            baseshippingrate=5;
            servicelevel="Budget";
        }
        else if(shippingspeed.equals("Standard")){
            baseshippingrate=10;
            servicelevel="Standard";
        }
        else if(shippingspeed.equals("Express")){
            baseshippingrate=25;
            servicelevel="Priority";
        }
        else if(shippingspeed.equals("Overnight")){
            baseshippingrate=50;
            servicelevel="Premium";
        }

        if(destinationzone.equals("Local")){
            zonemultiplier=1.0;
        }
        else if(destinationzone.equals("Regional")){
            zonemultiplier=1.2;
        }
        else if(destinationzone.equals("National")){
            zonemultiplier=1.5;
        }
        else if(destinationzone.equals("International")){
            zonemultiplier=3.0;
        }
        double weightsurcharge=1*packageweight;
        if(packagesize.equals("Small")){
            sizesurcharge=0;
        }
        else if(packagesize.equals("Medium")){
            sizesurcharge=5;
        }
        else if(packagesize.equals("Large")){
            sizesurcharge=15;
        }
        else if(packagesize.equals("Oversized")){
            sizesurcharge=30;
        }
        if(shippingspeed.equals("Economy")){
            if(destinationzone.equals("Local")){
                estimateddelivery=4;
            }
            else if(destinationzone.equals("Regional")){
                estimateddelivery=6;
            }
            else if(destinationzone.equals("National")){
                estimateddelivery=8;
            }
            else if(destinationzone.equals("International")){
                estimateddelivery=16;
            }
        }
        else if(shippingspeed.equals("Standard")){
            if(destinationzone.equals("Local")){
                estimateddelivery=2;
            }
            else if(destinationzone.equals("Regional")){
                estimateddelivery=5;
            }
            else if(destinationzone.equals("National")){
                estimateddelivery=6;
            }
            else if(destinationzone.equals("International")){
                estimateddelivery=12;
            }
        }
        else if(shippingspeed.equals("Express")){
            if(destinationzone.equals("Local")){
                estimateddelivery=1;
            }
            else if(destinationzone.equals("Regional")){
                estimateddelivery=2;
            }
            else if(destinationzone.equals("National")){
                estimateddelivery=2;
            }
            else if(destinationzone.equals("International")){
                estimateddelivery=4;
            }
        }
        else if(shippingspeed.equals("Overnight")){
            estimateddelivery=1;
        }
        basecost=(baseshippingrate+weightsurcharge)*zonemultiplier;
        totalcost=basecost+sizesurcharge;
    
        System.out.printf("Package Weight: %.1f lbs\n",packageweight);
        System.out.printf("Destination Zone: %s\n",destinationzone);
        System.out.printf("Shipping Speed: %s\n",shippingspeed);
        System.out.printf("Package Size: %s\n",packagesize);
        System.out.printf("Base Shipping Rate: $%.1f\n",baseshippingrate);
        System.out.printf("Weight Surcharge: $%.1f\n",weightsurcharge);
        System.out.printf("Zone Multiiplier: %.1fx\n",zonemultiplier);
        System.out.printf("Size Surcharge: $%.1f\n",sizesurcharge);
        System.out.printf("Total Shipping Cost: $%.2f\n",totalcost);
        System.out.printf("Estimated Delivery: %d business days\n",estimateddelivery);
        System.out.printf("Srvice Level: %s\n",servicelevel);
        sc.close();
    }
}
