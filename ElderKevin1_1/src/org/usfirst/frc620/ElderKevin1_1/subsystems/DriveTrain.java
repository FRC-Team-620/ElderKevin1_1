// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc620.ElderKevin1_1.subsystems;

import org.usfirst.frc620.ElderKevin1_1.RobotMap;
import org.usfirst.frc620.ElderKevin1_1.commands.*;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Ultrasonic;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    private double throttle = 1;
    private int speedlvl = 1;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon talonRR1 = RobotMap.driveTrainTalonRR1;
    private final CANTalon talonRF2 = RobotMap.driveTrainTalonRF2;
    private final CANTalon talonLF3 = RobotMap.driveTrainTalonLF3;
    private final CANTalon talonLR4 = RobotMap.driveTrainTalonLR4;
    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;
    private final Encoder encoderL = RobotMap.driveTrainEncoderL;
    private final Encoder encoderR = RobotMap.driveTrainEncoderR;
    private final AnalogGyro analogGyro = RobotMap.driveTrainAnalogGyro;
    private final Ultrasonic lidar = RobotMap.driveTrainLidar;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public int getSpeedlvl() {
        return speedlvl;
    }
    public void setSpeedlvl(int speedlvl) {
        this.speedlvl = speedlvl;
        switch(speedlvl){
        case -1:
            throttle = 0.6;
            break;
        case 0:
            throttle = 0.8;
            break;
        case 1:
            throttle = 1;
            break;
        default:
            setSpeedlvl(1);
            break;
        }
    }
    public void arcadeDrive(double speed, double turn) {
        robotDrive.arcadeDrive(speed*throttle, turn);
    }
    public double getYaw(){
        return analogGyro.getAngle();
    }
    public void resetGyro(){
        analogGyro.reset();
    }
}

