package Lab5;

import Components.*;
import DataObjects.DataFloat;
import DataObjects.DataSubPetriNet;
import DataObjects.DataTransfer;
import DataOnly.SubPetri;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

import java.util.ArrayList;

public class exp3p1 {
	public static PetriNet PN3() {
		// ----------------------- SubPetri ------------------------------------
		PetriNet pn3 = new PetriNet();
		pn3.PetriNetName = "PN3";
		pn3.NetworkPort = 0;

		DataFloat constVal31 = new DataFloat();
		constVal31.SetName("constVal31");
		constVal31.SetValue(0.1f);
		pn3.ConstantPlaceList.add(constVal31);

		DataFloat constVal32 = new DataFloat();
		constVal32.SetName("constVal32");
		constVal32.SetValue(3.0f);
		pn3.ConstantPlaceList.add(constVal32);

		DataFloat p31 = new DataFloat();
		p31.SetName("p31");
		pn3.PlaceList.add(p31);

		DataFloat p32 = new DataFloat();
		p32.SetName("p32");
		pn3.PlaceList.add(p32);

		DataFloat p33 = new DataFloat();
		p33.SetName("p33");
		pn3.PlaceList.add(p33);

		DataFloat p34 = new DataFloat();
		p34.SetName("p34");
		pn3.PlaceList.add(p34);

		DataTransfer p35 = new DataTransfer();
		p35.SetName("p35");
		p35.Value = new TransferOperation("localhost", "1080", "p6");
		pn3.PlaceList.add(p35);

		DataFloat p36 = new DataFloat();
		p36.SetName("p36");
		pn3.PlaceList.add(p36);

		// T31 ------------------------------------------------
		PetriTransition t31 = new PetriTransition(pn3);
		t31.TransitionName = "t31";
		t31.InputPlaceName.add("p31");

		Condition T31Ct1 = new Condition(t31, "p31", TransitionCondition.NotNull);

		GuardMapping grdT31 = new GuardMapping();
		grdT31.condition = T31Ct1;

		ArrayList<String> lstInput = new ArrayList<String>();
		lstInput.add("p31");
		lstInput.add("constVal31");
		grdT31.Activations.add(new Activation(t31, lstInput, TransitionOperation.Add, "p36"));
		grdT31.Activations.add(new Activation(t31, lstInput, TransitionOperation.Add, "p32"));

		t31.GuardMappingList.add(grdT31);
		t31.Delay = 0;
		pn3.Transitions.add(t31);

		// T32 ------------------------------------------------
		PetriTransition t32 = new PetriTransition(pn3);
		t32.TransitionName = "t32";
		t32.InputPlaceName.add("p32");

		Condition T32Ct1 = new Condition(t32, "p32", TransitionCondition.NotNull);

		GuardMapping grdT32 = new GuardMapping();
		grdT32.condition = T32Ct1;

		grdT32.Activations.add(new Activation(t32, "p32", TransitionOperation.Move, "p33"));
		grdT32.Activations.add(new Activation(t32, "p32", TransitionOperation.Move, "p34"));

		t32.GuardMappingList.add(grdT32);
		t32.Delay = 0;
		pn3.Transitions.add(t32);

		// T33 ------------------------------------------------
		PetriTransition t33 = new PetriTransition(pn3);
		t33.TransitionName = "t33";
		t33.InputPlaceName.add("p34");

		Condition T33Ct1 = new Condition(t33, "p34", TransitionCondition.NotNull);

		GuardMapping grdT33 = new GuardMapping();
		grdT33.condition = T33Ct1;

		grdT33.Activations.add(new Activation(t33, "p34", TransitionOperation.SendOverNetwork, "p35"));
		grdT33.Activations.add(new Activation(t33, "p34", TransitionOperation.Move, "p31"));

		t33.GuardMappingList.add(grdT33);
		t33.Delay = 0;
		pn3.Transitions.add(t33);

		// T34 ------------------------------------------------
		PetriTransition t34 = new PetriTransition(pn3);
		t34.TransitionName = "t34";
		t34.InputPlaceName.add("p33");

		Condition t34Ct1 = new Condition(t34, "p33", TransitionCondition.NotNull);
		Condition t34Ct2 = new Condition(t34, "p33", TransitionCondition.MoreThanOrEqual, "constVal32");
		t34Ct1.SetNextCondition(LogicConnector.AND, t34Ct2);

		GuardMapping grdT34 = new GuardMapping();
		grdT34.condition = t34Ct1;

		grdT34.Activations.add(new Activation(t34, "", TransitionOperation.StopPetriNet, ""));

		t34.GuardMappingList.add(grdT34);
		t34.Delay = 0;
		pn3.Transitions.add(t34);

		pn3.Delay = 1000;

		return pn3;
	}


	public static void main(String[] args) {
		PetriNet pn = new PetriNet();
		pn.PetriNetName = "PN1";
		pn.NetworkPort = 1080;

		// ------------------------------------------------------------------------

		DataFloat constVal = new DataFloat();
		constVal.SetName("constantVal");
		constVal.SetValue(2.0f);
		pn.ConstantPlaceList.add(constVal);

		DataSubPetriNet SP = new DataSubPetriNet();
		SP.SetName("PN3");
		SubPetri pn3 = new SubPetri(PN3());
		SP.SetValue(pn3);
		pn.ConstantPlaceList.add(SP);

//		DataSubPetriNet SP4 = new DataSubPetriNet();
//		SP4.SetName("PN4");
//		SubPetri pn4 = new SubPetri(PN4());
//		SP4.SetValue(pn4);
//		pn.ConstantPlaceList.add(SP4);

		DataFloat p1 = new DataFloat();
		p1.SetName("p1");
		p1.SetValue(2.0f);
		pn.PlaceList.add(p1);

		DataFloat p2 = new DataFloat();
		p2.SetName("p2");
		//p2.SetValue(2.0f); //testing
		pn.PlaceList.add(p2);

		DataSubPetriNet p3 = new DataSubPetriNet();
		p3.SetName("p3");
		pn.PlaceList.add(p3);

		DataTransfer p3Send = new DataTransfer();
		p3Send.SetName("p3Send");
		p3Send.Value = new TransferOperation("localhost", "1090", "p22");
		pn.PlaceList.add(p3Send);

		DataFloat p4 = new DataFloat();
		p4.SetName("p4");
		pn.PlaceList.add(p4);

		DataFloat p5 = new DataFloat();
		p5.SetName("p5");
		pn.PlaceList.add(p5);

		DataFloat p6 = new DataFloat();
		p6.SetName("p6");
		pn.PlaceList.add(p6);

		DataFloat p7 = new DataFloat();
		p7.SetName("p7");
		pn.PlaceList.add(p7);

		// T1 ------------------------------------------------
		PetriTransition t1 = new PetriTransition(pn);
		t1.TransitionName = "t1";
		t1.InputPlaceName.add("p1");
		t1.InputPlaceName.add("p2");

		Condition T1Ct1 = new Condition(t1, "p1", TransitionCondition.NotNull);
		// CHANGED SUBGUARD Condition
		Condition T1Ct2 = new Condition(t1, "p2", TransitionCondition.LessThanOrEqual,"constantVal");
		T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

		GuardMapping grdT1 = new GuardMapping();
		grdT1.condition = T1Ct1;

		grdT1.Activations.add(new Activation(t1, "PN3", TransitionOperation.Copy, "p3"));
		grdT1.Activations.add(new Activation(t1, "p1", TransitionOperation.Move, "p4"));
		grdT1.Activations.add(new Activation(t1, "p4", TransitionOperation.Move, "p2-p21"));
		grdT1.Activations.add(new Activation(t1, "p2", TransitionOperation.Move, "p41"));


		t1.GuardMappingList.add(grdT1);

		// ADDED SUBGUARD to t1
//		Condition T1Ct12 = new Condition(t1, "p1", TransitionCondition.NotNull);
//		Condition T1Ct22 = new Condition(t1, "p2", TransitionCondition.MoreThanOrEqual,"constantVal");
//		T1Ct12.SetNextCondition(LogicConnector.AND, T1Ct22);
//
//		GuardMapping grdT12 = new GuardMapping();
//		grdT12.condition = T1Ct12;
//
//		grdT12.Activations.add(new Activation(t1, "PN4", TransitionOperation.Copy, "p3"));
//		grdT12.Activations.add(new Activation(t1, "p1", TransitionOperation.Move, "p4"));
//		grdT12.Activations.add(new Activation(t1, "p2", TransitionOperation.Move, "p41"));


//		t1.GuardMappingList.add(grdT12);

		t1.Delay = 0;
		pn.Transitions.add(t1);

		// T1 Send ------------------------------------------------
		PetriTransition t1Send = new PetriTransition(pn);
		t1Send.TransitionName = "t1Send";
		t1Send.InputPlaceName.add("p3");

		Condition T1SendCt1 = new Condition(t1Send, "p3", TransitionCondition.NotNull);

		GuardMapping grdT1Send = new GuardMapping();
		grdT1Send.condition = T1SendCt1;

		grdT1Send.Activations.add(new Activation(t1Send, "p3", TransitionOperation.SendPetriNetOverNetwork, "p3Send"));

		t1Send.GuardMappingList.add(grdT1Send);
		t1Send.Delay = 0;
		pn.Transitions.add(t1Send);

		// T2 ------------------------------------------------
		PetriTransition t2 = new PetriTransition(pn);
		t2.TransitionName = "t2";
		t2.InputPlaceName.add("p5");
		t2.InputPlaceName.add("p6");

		Condition T2Ct1 = new Condition(t2, "p5", TransitionCondition.NotNull);
		Condition T2Ct2 = new Condition(t2, "p6", TransitionCondition.NotNull);
		T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

		GuardMapping grdT2 = new GuardMapping();
		grdT2.condition = T2Ct1;

		grdT2.Activations.add(new Activation(t2, "p5", TransitionOperation.Move, "p1"));
		grdT2.Activations.add(new Activation(t2, "p6", TransitionOperation.Move, "p7"));

		t2.GuardMappingList.add(grdT2);
		t2.Delay = 0;
		pn.Transitions.add(t2);

		// T3 ------------------------------------------------
		PetriTransition t3 = new PetriTransition(pn);
		t3.TransitionName = "t3";
		t3.InputPlaceName.add("p4");

		Condition T3Ct1 = new Condition(t3, "p4", TransitionCondition.NotNull);

		GuardMapping grdT3 = new GuardMapping();
		grdT3.condition = T3Ct1;

		grdT3.Activations.add(new Activation(t3, "p4", TransitionOperation.Move, "p5"));

		t3.GuardMappingList.add(grdT3);
		t3.Delay = 0;
		pn.Transitions.add(t3);

		System.out.println("Ex3_1 started \n ------------------------------");
		pn.Delay = 5000;

		PetriNetWindow frame = new PetriNetWindow(false);
		frame.petriNet = pn;
		frame.setVisible(true);
	}
}