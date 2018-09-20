import java.util.Scanner;

class Solution {
    private Solution () {

    }
    public static void main(String[] args) {
        Fitness fit = new Fitness();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String line = scan.nextLine();
            String[] input = line.split(" ");
            switch (input[0]) {
                case "food":
                    fit.addFood(new Data(input[1], Double.parseDouble(input[2]), input[3]));
                    break;
                case "water":
                    fit.addWater(new Data(Double.parseDouble(input[1]), input[2]));
                    break;
                case "physicalactivity":
                    if (input.length == 6) {
                    } else {
                        fit.addPhysical(new Phyact(input[1], input[2], input[3], input[4]));
                    }
                    break;
                case "weight":
                    fit.addWeight(new Weight(Double.parseDouble(input[1]), Double.parseDouble(input[2]), input[3]));
                    break;
                case "sleep":
                    fit.addSleep(new Sleep(input[1], input[2]));
                    break;
                case "foodlog":
                    fit.foodlog();
                    break;
                case "waterlog":
                    fit.waterlog();
                    break;
                case "physicalactivitylog":
                    fit.physicallog();
                    break;
                case "weightlog":
                    fit.weightlog();
                    break;
                case "sleeplog":
                    fit.sleeplog();
                    break;
                case "summary":
                    fit.summary();
                    break;
                default:
                break;
            }
        }
    }
}
