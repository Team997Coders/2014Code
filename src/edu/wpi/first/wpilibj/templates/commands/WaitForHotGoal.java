/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 *
 * @author 997robotics4
 */
public class WaitForHotGoal extends CommandBase {
    Timer myTimer;
    public WaitForHotGoal(Timer a) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(myAimer);
        requires(subShooter);
        myTimer = a;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        myTimer.reset();
        myTimer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {     
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;// myTimer.get() >= 5 || myAimer.goalIsHot();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
