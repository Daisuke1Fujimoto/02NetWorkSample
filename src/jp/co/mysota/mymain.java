//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	jp.vstone.network.*;
import	java.awt.Color;

public class mymain
{

	public CRobotPose pose;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,32,0,160,0,False,2,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,96,0,96,0,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	/*
	GlobalVariable.booleanResult = TCPIPClient.postString((String)"172.16.168.46",(short)5001,(String)"packet");		//@<BlockInfo>jp.vstone.block.tcpipiclient,672,656,736,656,False,3,@</BlockInfo>
	if(GlobalVariable.booleanResult)
	{
																														//@<OutputChild>
																														//@</OutputChild>

	}
	else
	{
																														//@<OutputChild>
																														//@</OutputChild>

	}

																														//@<EndOfBlock/>

	*/

	//@<Separate/>
	/*
	GlobalVariable.booleanResult = TCPIPClient.postString((String)"172.16.168.46",(short)5001,(String)"green");			//@<BlockInfo>jp.vstone.block.tcpipiclient,288,656,416,656,False,6,@</BlockInfo>
	if(GlobalVariable.booleanResult)
	{
																														//@<OutputChild>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,352,656,352,656,False,4,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,-900,-650,0,50,30}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,0,0,255,0,0,255}
						);
		GlobalVariable.motion.play(pose,1000);
		CRobotUtil.wait(1000);																							//@<EndOfBlock/>
																														//@</OutputChild>

	}
	else
	{
																														//@<OutputChild>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,352,752,352,752,False,5,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,700,650,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,1400);
		CRobotUtil.wait(1400);																							//@<EndOfBlock/>
																														//@</OutputChild>

	}

																														//@<EndOfBlock/>

	*/

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,0,320,1296,320,False,28,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		String varReceiveSpeechText="";																					//@<BlockInfo>jp.vstone.block.variable,64,320,64,320,False,27,break@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,128,320,128,320,False,26,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,400);
		CRobotUtil.wait(400);																							//@<EndOfBlock/>
		{																												//@<BlockInfo>jp.vstone.block.tcpip.server.init,208,320,1232,320,False,25,@</BlockInfo>
			TCPIPServer tcpipServer = new TCPIPServer((short)5001,(int)60000);
			
																														//@<OutputChild>
			CRobotUtil.Log(getClass().getSimpleName(), (String)"◆初期化完了");												//@<BlockInfo>jp.vstone.block.printlog,304,320,304,320,False,24,@</BlockInfo>	@<EndOfBlock/>
			while(GlobalVariable.TRUE)																					//@<BlockInfo>jp.vstone.block.while.endless,400,320,1024,320,False,23,Endless@</BlockInfo>
			{

																														//@<OutputChild>
				CRobotUtil.Log(getClass().getSimpleName(), (String)"◆まち");												//@<BlockInfo>jp.vstone.block.printlog,464,320,464,320,False,21,@</BlockInfo>	@<EndOfBlock/>
				try{																									//@<BlockInfo>jp.vstone.block.tcpip.server,544,176,928,176,False,20,@</BlockInfo>
					GlobalVariable.recvString = tcpipServer.waitRequest();

					if(GlobalVariable.recvString==null) GlobalVariable.recvString="";
					if(GlobalVariable.recvString.contentEquals((String)"green"))
					{
																														//@<OutputChild>
						CRobotUtil.Log(getClass().getSimpleName(), (String)GlobalVariable.recvString);						//@<BlockInfo>jp.vstone.block.printlog,656,176,656,176,False,9,@</BlockInfo>	@<EndOfBlock/>
						GlobalVariable.sotawish.Say((String)"ぐりーん",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,752,176,752,176,False,8,@</BlockInfo>
																															//@<EndOfBlock/>
						pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,816,176,816,176,False,7,コメント@</BlockInfo>
						pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{-2,346,-583,-569,495,-3,-170,187}
										);
						pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{100,100,100,100,100,100,100,100}
										);
						pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
										new Short[]{0,-255,0,0,255,0,0,255,0}
										);
						GlobalVariable.motion.play(pose,1800);
						CRobotUtil.wait(1800);																				//@<EndOfBlock/>
																																//@</OutputChild>

					}
					else if(GlobalVariable.recvString.contentEquals((String)"red"))
					{
																														//@<OutputChild>
						CRobotUtil.Log(getClass().getSimpleName(), (String)GlobalVariable.recvString);						//@<BlockInfo>jp.vstone.block.printlog,656,272,656,272,False,12,@</BlockInfo>	@<EndOfBlock/>
						GlobalVariable.sotawish.Say((String)"あか",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,752,272,752,272,False,11,@</BlockInfo>
																															//@<EndOfBlock/>
						pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,816,272,816,272,False,10,コメント@</BlockInfo>
						pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{-649,-135,-40,98,-166,-3,-176,-284}
										);
						pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{100,100,100,100,100,100,100,100}
										);
						pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
										new Short[]{255,0,0,255,0,0,255,0,0}
										);
						GlobalVariable.motion.play(pose,1700);
						CRobotUtil.wait(1700);																				//@<EndOfBlock/>
																																//@</OutputChild>

					}
					else if(GlobalVariable.recvString.contentEquals((String)"end"))
					{
																														//@<OutputChild>
						CRobotUtil.Log(getClass().getSimpleName(), (String)GlobalVariable.recvString);						//@<BlockInfo>jp.vstone.block.printlog,656,368,656,368,False,15,@</BlockInfo>	@<EndOfBlock/>
						GlobalVariable.sotawish.Say((String)"おわり",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,752,368,752,368,False,14,@</BlockInfo>
																															//@<EndOfBlock/>
						break;																								//@<BlockInfo>jp.vstone.block.break,816,368,816,368,False,13,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

					}
					else
					{
																														//@<OutputChild>
						varReceiveSpeechText=(String)GlobalVariable.recvString;												//@<BlockInfo>jp.vstone.block.calculater,608,560,608,560,False,29,@</BlockInfo>
																															//@<EndOfBlock/>
						CRobotUtil.Log(getClass().getSimpleName(), (String)GlobalVariable.recvString);						//@<BlockInfo>jp.vstone.block.printlog,672,464,672,464,False,19,@</BlockInfo>	@<EndOfBlock/>
						CRobotUtil.Log(getClass().getSimpleName(), (String)varReceiveSpeechText);							//@<BlockInfo>jp.vstone.block.printlog,736,464,736,464,False,18,@</BlockInfo>	@<EndOfBlock/>
						GlobalVariable.sotawish.Say((String)varReceiveSpeechText,MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,800,464,800,464,False,17,@</BlockInfo>
																															//@<EndOfBlock/>
						pose = new CRobotPose();																			//@<BlockInfo>jp.vstone.block.pose,864,464,864,464,False,16,コメント@</BlockInfo>
						pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{1303,-883,-524,785,556,-2,1,-176}
										);
						pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
										new Short[]{100,100,100,100,100,100,100,100}
										);
						pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
										new Short[]{255,-255,255,180,80,0,255,255,255}
										);
						GlobalVariable.motion.play(pose,2100);
						CRobotUtil.wait(2100);																				//@<EndOfBlock/>
																																//@</OutputChild>

					}
					
				} catch(Exception e) { }
																														//@<EndOfBlock/>
																														//@</OutputChild>
			}
																														//@<EndOfBlock/>
			CRobotUtil.Log(getClass().getSimpleName(), (String)"◆ループ抜けました");											//@<BlockInfo>jp.vstone.block.printlog,1136,320,1136,320,False,22,@</BlockInfo>	@<EndOfBlock/>
																														//@</OutputChild>

			
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	/*
	varReceiveSpeechText=(String)new String(GlobalVariable.recvString.getBytes("SJIS"), "UTF-8");						//@<BlockInfo>jp.vstone.block.calculater,784,560,784,560,False,30,@</BlockInfo>
																														//@<EndOfBlock/>

	*/

}
