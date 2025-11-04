package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous(name="AutoSisyphusMove", group="Robot")

public class AutoSisyphusMove extends LinearOpMode {
    Hardware11241 robot = new Hardware11241();   // Use Team 11241's hardware
    /* Declare OpMode members. */
    private ElapsedTime     runtime = new ElapsedTime();


    @Override
    public void runOpMode() throws InterruptedException{
        // Initialize the hardware variables.
        // * The init() method of the hardware class does all the work here
        robot.init(hardwareMap);
        double driveForward = (0);
        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "ready");    //
        telemetry.update();

        // Wait for the game to start (driver presses START)
        waitForStart();

        robot.leftBackDrive.setPower(0.25);
        robot.rightBackDrive.setPower(0.25);
        robot.rightFrontDrive.setPower(0.25);
        robot.leftFrontDrive.setPower(0.25);

        sleep(2000);

        robot.leftBackDrive.setPower(0);
        robot.rightBackDrive.setPower(0);
        robot.rightFrontDrive.setPower(0);
        robot.leftFrontDrive.setPower(0);
    }
}
