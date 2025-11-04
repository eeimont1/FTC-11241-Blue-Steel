/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode;

import static java.lang.Thread.sleep;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * This is NOT an opmode.
 *
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a Pushbot.
 * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
 *
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 *
 * Motor channel:  Left Back Drive motor:     "leftBackDrive"
 * Motor channel:  Right Back Drive motor:    "rightBackDrive"
 * Motor channel:  Left Front Drive motor:    "leftFrontDrive"
 * Motor channel:  Right Front Drive motor:   "rightFrontDrive"
 * Motor channel:  Front Flywheel Motor:      "frontFlywheels"
 *
 */
public class Hardware11241 {
    /* Public OpMode members. */
    public DcMotor leftBackDrive = null;
    public DcMotor rightBackDrive = null;
    public DcMotor leftFrontDrive = null;
    public DcMotor rightFrontDrive = null;
    public DcMotor intakeMotor = null;
    public DcMotor flyWheelMotor1 = null;
    public DcMotor flyWheelMotor2 = null;
    public Servo launchServo = null;
        /* local OpMode members. */
    private HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    /* Constructor */
    public Hardware11241() {

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        leftBackDrive = hwMap.get(DcMotor.class, "leftBackDrive");
        rightBackDrive = hwMap.get(DcMotor.class, "rightBackDrive");
        leftFrontDrive = hwMap.get(DcMotor.class, "leftFrontDrive");
        rightFrontDrive = hwMap.get(DcMotor.class, "rightFrontDrive");
        intakeMotor = hwMap.get(DcMotor.class, "intakeMotor");
        flyWheelMotor1 = hwMap.get(DcMotor.class, "flyWheelMotor1");
        flyWheelMotor2 = hwMap.get(DcMotor.class, "flyWheelMotor2");
        //hangMotor = hwMap.get(DcMotor.class, "hangMotor");
        //hangMotor2 = hwMap.get(DcMotor.class, "hangMotor2");
        //mouseSensor = hwMap.get(SparkFunOTOS.class, "mouseSensor");

        leftBackDrive.setDirection(DcMotor.Direction.FORWARD);  // Set to FORWARD FOR goBILDA motors
        rightBackDrive.setDirection(DcMotor.Direction.REVERSE); //// Set to "" goBILDA motors
        rightFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        leftFrontDrive.setDirection(DcMotor.Direction.FORWARD);
        intakeMotor.setDirection(DcMotor.Direction.FORWARD);
        flyWheelMotor1.setDirection(DcMotor.Direction.FORWARD);
        flyWheelMotor2.setDirection(DcMotor.Direction.REVERSE);
        // Set to "" goBILDA motors
        //hangMotor2.setDirection(DcMotorSimple.Direction.FORWARD);
        //hangMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        // Set all motors to zero power
        leftBackDrive.setPower(0);
        rightBackDrive.setPower(0);
        rightFrontDrive.setPower(0);
        leftFrontDrive.setPower(0);
        intakeMotor.setPower(0);
        flyWheelMotor1.setPower(0);
        flyWheelMotor2.setPower(0);
        //hangMotor.setPower(0);
        //hangMotor2.setPower(0);

        // Set all motors to run without encoders except liftMotor.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftBackDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightBackDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftFrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightFrontDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        intakeMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        flyWheelMotor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        flyWheelMotor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //hangMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //hangMotor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Define and initialize ALL installed servos.
        launchServo = hwMap.get(Servo.class, "launchServo");
        launchServo.setPosition(0.50);

    }
}