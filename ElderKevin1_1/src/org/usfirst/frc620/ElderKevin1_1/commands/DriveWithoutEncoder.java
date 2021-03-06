// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc620.ElderKevin1_1.commands;

import org.usfirst.frc620.ElderKevin1_1.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithoutEncoder extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    private double m_time;
    private double m_speed;
    private boolean isFinished;
    Timer timer = new Timer();
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public DriveWithoutEncoder(double time, double speed) {
    	

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        m_time = time;
        m_speed = speed;
 

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.start();
    	RobotMap.driveTrainTalonRR1.set(m_speed);
    	RobotMap.driveTrainTalonRF2.set(m_speed);
    	RobotMap.driveTrainTalonLF3.set(m_speed);
    	RobotMap.driveTrainTalonLR4.set(m_speed);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (timer.get() >= m_time); 
    }

    // Called once after isFinished returns true
    protected void end() {
    	m_speed = 0;
    	RobotMap.driveTrainTalonRR1.set(m_speed);
    	RobotMap.driveTrainTalonRF2.set(m_speed);
    	RobotMap.driveTrainTalonLF3.set(m_speed);
    	RobotMap.driveTrainTalonLR4.set(m_speed);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
