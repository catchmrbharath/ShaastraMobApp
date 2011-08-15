package com.shaastra;

import java.util.HashMap;
public final class gallerymanager {
	
	public static final Integer[] catIds={R.drawable.impact,R.drawable.design,R.drawable.coding,R.drawable.involve,R.drawable.dept,R.drawable.spotlight,R.drawable.exhi,R.drawable.quiz,R.drawable.gradient,R.drawable.exhi,R.drawable.involve};
	public static final Integer[] imageIDs = {
 R.drawable.dept, R.drawable.dept, R.drawable.dept, R.drawable.dept, R.drawable.dept,R.drawable.dept,R.drawable.dept,
 R.drawable.design,R.drawable.design,R.drawable.design,R.drawable.design,R.drawable.design,R.drawable.design,R.drawable.design,
 R.drawable.involve,R.drawable.involve,R.drawable.involve,R.drawable.involve,R.drawable.involve,R.drawable.involve,R.drawable.involve,R.drawable.involve,R.drawable.involve,
 //aerofest
 R.drawable.involve,R.drawable.involve,R.drawable.involve,R.drawable.involve,
 R.drawable.spotlight,R.drawable.spotlight,R.drawable.spotlight,R.drawable.spotlight,R.drawable.spotlight,R.drawable.spotlight,
 R.drawable.quiz,R.drawable.quiz,R.drawable.quiz,
 R.drawable.coding,R.drawable.coding,R.drawable.coding,R.drawable.coding,R.drawable.coding,R.drawable.coding,R.drawable.coding,R.drawable.coding,
 R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,
//online
 R.drawable.gradient,R.drawable.gradient,R.drawable.gradient,R.drawable.gradient,R.drawable.gradient,R.drawable.gradient,R.drawable.gradient,
//workshops
 R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,R.drawable.exhi,
R.drawable.impact,R.drawable.impact,R.drawable.impact,R.drawable.impact,
R.drawable.gradient,//workshops
R.drawable.exhi
        };
	public static final Integer[][] eventids  = {
        {65,66,67,68},
        {8,9,10,11,12,13,14},
        {37,38,39,40,41,42,43,44},
        {15,16,17,18,19,20,21,22,23},
        {1,2,3,4,5,6,7},	
        {28,29,30,31,32,33},
        {60,61,62,63,64},
        {34,35,36},
        {53,54,55,56,57,58,69},
        {45,46,47,48,49,50,51,52,70},
        {24,25,26,27}
       };	
	public static final HashMap<Integer, String> eventNameHash = new HashMap<Integer, String>();
	static {
	eventNameHash.put(1," Wright Design "); 
	eventNameHash.put(2," BioDocks! "); 
	eventNameHash.put(3," Chemtrek "); 
	eventNameHash.put(4," Infrafest "); 
	eventNameHash.put(5," Code Darwin "); 
	eventNameHash.put(6," Desmod "); 
	eventNameHash.put(7," SCDC "); 
	eventNameHash.put(8," Robotics "); 
	eventNameHash.put(9," RoboWars "); 
	eventNameHash.put(10," Contraptions "); 
	eventNameHash.put(11," Junkyard Wars "); 
	eventNameHash.put(12," Project X "); 
	eventNameHash.put(13," Fire N Ice "); 
	eventNameHash.put(14," Pentathlon "); 
	eventNameHash.put(15," Chemical X "); 
	eventNameHash.put(16," Daily Events "); 
	eventNameHash.put(17," Sci-fi Writing "); 
	eventNameHash.put(18," Ignobel "); 
	eventNameHash.put(19," Puzzle Championship "); 
	eventNameHash.put(20," Shaastra Cube Open "); 
	eventNameHash.put(21," Watts Up "); 
	eventNameHash.put(22," IQ "); 
	eventNameHash.put(23," Math Modelling "); 
	eventNameHash.put(24," Aerobotics "); 
	eventNameHash.put(25," Top Gun "); 
	eventNameHash.put(26," Air Show "); 
	eventNameHash.put(27," Paper Plane "); 
	eventNameHash.put(28," Gamer's Inn "); 
	eventNameHash.put(29," Shaastra Maze-Takeshi's Castle "); 
	eventNameHash.put(30," Bulls & Bears "); 
	eventNameHash.put(31," Paper & Poster Presentation "); 
	eventNameHash.put(32," Lectures & VCs "); 
	eventNameHash.put(33," Industry Defined Problems "); 
	eventNameHash.put(34," Shaastra Main Quiz "); 
	eventNameHash.put(35," How Things Work "); 
	eventNameHash.put(36," Auto Quiz "); 
	eventNameHash.put(37," Automania "); 
	eventNameHash.put(38," Babel "); 
	eventNameHash.put(39," Online Programming Contest "); 
	eventNameHash.put(40," Distro "); 
	eventNameHash.put(41," Sim Champ "); 
	eventNameHash.put(42," HACKFEST "); 
	eventNameHash.put(43," Deep Blue "); 
	eventNameHash.put(44," Code Obfuscation "); 
	eventNameHash.put(45," Ethical Hacking Workshop "); 
	eventNameHash.put(46," Innovationeer "); 
	eventNameHash.put(47," Astrophotography "); 
	eventNameHash.put(48," Nanomaterials "); 
	eventNameHash.put(49," Forensics "); 
	eventNameHash.put(50," Fossils "); 
	eventNameHash.put(51," Android Development "); 
	eventNameHash.put(52," Digital Circuits "); 
	eventNameHash.put(53," Estock Bazaar "); 
	eventNameHash.put(54," Online Math Champ "); 
	eventNameHash.put(55," Online Puzzle Champ "); 
	eventNameHash.put(56," Online Quiz "); 
	eventNameHash.put(57," Kryptx "); 
	eventNameHash.put(58," Online Games "); 
	eventNameHash.put(59," testevent "); 
	eventNameHash.put(60," Industrial Expo "); 
	eventNameHash.put(61," Government Exhibition "); 
	eventNameHash.put(62," IIT Madras Technical Museum "); 
	eventNameHash.put(63," Innovation X "); 
	eventNameHash.put(64," Shaastra Nights "); 
	eventNameHash.put(65," IIT Madras Symposium 2011 "); 
	eventNameHash.put(66," Sankalp "); 
	eventNameHash.put(67," Inter-University Sustainability Challenge "); 
	eventNameHash.put(68," Shaastra Social Innovation Challenge "); 
	eventNameHash.put(69," Online Sci-Fi Writing "); 
	eventNameHash.put(70," Parallel Programming Workshop "); 
	}
	


}