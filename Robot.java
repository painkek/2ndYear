public import java.util.Scanner;

public class Robot {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //create a sublcass of a robot that handles a message.
        Robot robot = new Robot();
        System.out.println("=========== Robot Console App ===========");
        System.out.println("\tWelcome! This is Robot");
        System.out.println(" -> Would you like to start? \n1. Yes \n2. Exit");
        byte intro = sc.nextByte();
        if(intro == 1){
            robot.choices();
        }else if(intro >= 2){
            System.out.println("The robot has been terminated!");
        }
    }
}
    class Robot{

        public static final Scanner sc = new Scanner(System.in);
        public void choices() {
            System.out.println(" -> Do you want the robot to move? \n1. Yes \n2. Add steps for Robot");
            byte robotMovement = sc.nextByte();
            switch(robotMovement){
                case 1: travel(); break;
                case 2: travel(1); break;
           }
        }
        public void travel (){
            //to function the robot to move forward
            System.out.println(" ==> The Robot has move 1 step Forward \nDo you want to Add steps? \n1. Yes \n2. No");
            byte continueSteps = sc.nextByte();
            if(continueSteps == 1){
                travel(2);       
            }else if(continueSteps == 2){
                System.out.println("The robot has been terminated!");
            }
        }
        public void travel (int n){
            //causes the robot to move forward as it can
            System.out.println(" -> Insert number steps for robot to move");
            int steps = sc.nextInt();

            for(int i = 1; i < steps; i++){
                System.out.println(" ==> The robot has moved forward");
            }
            System.out.println(" !!!! The robot sensor faced an obstacle !!!! \nDo you want to Change Direction? \n1. Yes \n2. No");
            byte dodgeObstacle = sc.nextByte();
            if(dodgeObstacle == 1){
                face();
            }else if (dodgeObstacle == 2){
                System.out.println("The robot has been terminated!");
            }
        }
        public void face(){
            //declaring input scanner for face direction
            Scanner faceInput = new Scanner(System.in);
            //causes the robot to face direction
            //NORTH, SOUTH, EAST, WEST (WASD)
            System.out.println("Which direction do you want your robot to face?");
            System.out.println("---------------------------------------");
            System.out.println("= Simple Guide: ");
            System.out.println(" -> Directions:");
            System.out.println("   > W - Head North");
            System.out.println("   > A - Head West");
            System.out.println("   > S - Head South");
            System.out.println("   > D - Head East");
            System.out.println("---------------------------------------");
            System.out.println("Choose a Direction");
           
            String changeDirection = faceInput.nextLine();
            switch(changeDirection){
                  case "W":
                        System.out.println("The robot changed it direction to North");
                        travel();
                        break;
                  case "A":
                        System.out.println("The robot changed it direction to West");
                        travel();
                        break; 
                  case "S":
                        System.out.println("The robot changed it direction to South"); 
                        travel();
                        break;
                  case "D":
                        System.out.println("The robot changed it direction to East"); 
                        travel();
                        break;
                  default:
                        System.out.println("You entered a Wrong Key | The robot has been terminated");
                      
        }
    }
} Robot {
    
}
