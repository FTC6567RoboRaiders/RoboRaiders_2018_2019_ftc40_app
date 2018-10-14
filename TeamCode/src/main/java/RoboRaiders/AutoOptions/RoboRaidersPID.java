package RoboRaiders.AutoOptions;

public class RoboRaidersPID {
    public double Kp = 0;
    public double Ki = 0;
    public double Kd = 0;


 public void pidWithCounts (){
     While(encoder") {
             error = ("Target Value") - ("Sensor Value");
     integral = integral + error;

     if (error = 0) {
         integral = 0;
     }
     if (abs(error) > 100) {
         integral = 0;
     }
     derivative = error - previous_error;
     previous_error = error;
     power = Kp*error + Ki*integral + Kd*dirvative;
    }
 public void pidWithDistance () {
     While(encoder) {
             error = ("Sensor Value") - ("Target Value");
     integral = integral + error;

     if (error = 0) {
         integral = 0;
     }
     if (abs(error) > 100) {
         integral = 0;
     }
     derivative = error - previous_error;
     previous_error = error;
     power = Kp*error + Ki*integral + Kd*dirvative;
 }
}
}