package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import RoboRaiders.AutoOptions.RoboRaidersPID;



public abstract class RoboraiderAutonomous extends LinearOpMode {

    ProtoBot robot = new ProtoBot();
    RoboRaidersPID drivePID = new RoboRaidersPID();

    public double motor_power;
    private double Target;




    public void EncoderDrivePID() {
        while (opModeIsActive() && robot.getSortedEncoderCount() > Target) {
            motor_power = drivePID.pidWithCounts(1000, robot.getSortedEncoderCount());
            robot.setDriveMotorPower(motor_power, motor_power, motor_power, motor_power);
        }
    }

    public void DistanceDrivePID() {
        while (opModeIsActive() && robot.getSensorDistance() > Target) {
            motor_power = drivePID.pidWithDistance(robot.getSensorDistance(), 1000);
            robot.setDriveMotorPower(motor_power, motor_power, motor_power, motor_power);


        }
    }
}
