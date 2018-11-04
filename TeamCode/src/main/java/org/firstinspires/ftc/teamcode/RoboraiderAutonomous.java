package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import RoboRaiders.AutoOptions.RoboRaidersPID;



public abstract class RoboraiderAutonomous extends LinearOpMode {

    ProtoBot robot = new ProtoBot();
    RoboRaidersPID drivePID = new RoboRaidersPID();

    public double motor_power;





    public void EncoderDrivePID(double Target) {
        while (opModeIsActive() && robot.getSortedEncoderCount() < robot.calculateCOUNTS(Target)) {
                motor_power = drivePID.pidWithCounts(robot.calculateCOUNTS(Target), robot.getSortedEncoderCount());
            robot.setDriveMotorPower(motor_power, motor_power, motor_power, motor_power);

            telemetry.addData("Encoder Count", robot.getSortedEncoderCount());
            telemetry.addData("Target Count", robot.calculateCOUNTS(Target));
            telemetry.update();
        }
    }

  /*  public void DistanceDrivePID() {
        while (opModeIsActive() && robot.getSensorDistance() < Target) {
            motor_power = drivePID.pidWithDistance(robot.getSensorDistance(), Target);
            robot.setDriveMotorPower(motor_power, motor_power, motor_power, motor_power);

            telemetry.addData("Distance Sensor", robot.getSortedEncoderCount());
            telemetry.addData("Target Distance", Target);
            telemetry.update();

        }*/
    }

