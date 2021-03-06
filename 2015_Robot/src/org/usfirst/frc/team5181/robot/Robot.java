
package org.usfirst.frc.team5181.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
	DriveTrain driveTrain;
	Joystick gamePad;
	Actuators actuators;
	
    public void robotInit() {
    	gamePad = new Joystick(0);
    	actuators = new Actuators();
    	driveTrain = new DriveTrain(actuators);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	driveTrain.tankDrive(-1 * gamePad.getRawAxis(CustomJoystick.LEFT_Stick_Y), -1 * gamePad.getRawAxis(CustomJoystick.RIGHT_Stick_Y));
    }
    
}
