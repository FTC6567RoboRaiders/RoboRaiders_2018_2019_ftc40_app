package RoboRaiders.AutoOptions;

public class RoboRaidersPID {
    public double Kp = 0;
    public double Ki = 0;
    public double Kd = 0;
    public double error;
    public double integral;
    public double derivative;
    public double previous_error;
    public double power;





    public double pidWithCounts(double Target, double Sensor) {

        error = (Target) - (Sensor);
        integral = integral + error;

        if (error == 0) {
            integral = 0;
        }
        if (Math.abs(error) > 100) {
            integral = 0;
        }
        derivative = error - previous_error;
        previous_error = error;
        power = Kp * error + Ki * integral + Kd * derivative;

        return power;
    }


     public double pidWithDistance (double Sensor, double Target){

         error = (Sensor) - (Target);
         integral = integral + error;

         if (error == 0) {
             integral = 0;
         }
         if (Math.abs(error) > 100) {
             integral = 0;
         }
         derivative = error - previous_error;
         previous_error = error;
         power = Kp * error + Ki * integral + Kd * derivative;


         return power;
     }

 }
