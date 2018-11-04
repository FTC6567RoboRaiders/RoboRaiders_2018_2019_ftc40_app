package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Autonomous

public class ProtoAutonomous extends RoboraiderAutonomous {


    @Override
    public void runOpMode() throws InterruptedException {
        robot.initialize(hardwareMap);
        robot.runWithEncoders();

        EncoderDrivePID(11);


    }

    }

