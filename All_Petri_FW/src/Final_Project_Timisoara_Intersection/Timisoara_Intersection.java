package Final_Project_Timisoara_Intersection;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Timisoara_Intersection {

    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Lanes";
        pn.SetName("Lanes");
        pn.NetworkPort = 1080;

        // Middle Intersection
        // ---- Vasile Goldis----

        DataCar p1 = new DataCar(); // p12
        p1.SetName("p1");
        pn.PlaceList.add(p1);

        DataCarQueue p2 = new DataCarQueue(); // p11
        p2.Value.Size = 1;
        p2.SetName("p2");
        pn.PlaceList.add(p2);

        DataCar p3 = new DataCar(); // p10
        p3.SetName("p3");
        pn.PlaceList.add(p3);

        DataString p4 = new DataString(); // Peds 3
        p4.SetName("Pedestrians");
        pn.PlaceList.add(p4);

        DataString p5 = new DataString(); // userreq3
        p5.SetName("UserReqVG");
        pn.PlaceList.add(p5);

        DataString p6 = new DataString(); // ps3
        p6.SetName("Sem1");
        pn.PlaceList.add(p6);

        DataTransfer OPReq = new DataTransfer(); // Op3
        OPReq.SetName("OPReq");
        OPReq.Value = new TransferOperation("localhost", "1081" , "UserReq");
        pn.PlaceList.add(OPReq);

        // Bulevardul Revolutiei 1989

        // Exit Lane-->W
        DataCarQueue pBR1 = new DataCarQueue();
        pBR1.Value.Size=2;
        pBR1.SetName("pBR1");
        pn.PlaceList.add(pBR1);

        DataCar pBR2 = new DataCar();
        pBR2.SetName("pBR2");
        pn.PlaceList.add(pBR2);

        // Entering lane -->W

        DataCar pBREnter1 = new DataCar(); // pBREnter12
        pBREnter1.SetName("pBREnter1");
        pn.PlaceList.add(pBREnter1);

        DataCarQueue pBREnter2 = new DataCarQueue(); // p11
        pBREnter2.Value.Size = 1;
        pBREnter2.SetName("pBREnter2");
        pn.PlaceList.add(pBREnter2);

        DataCar pBREnter3 = new DataCar(); // p10
        pBREnter3.SetName("pBREnter3");
        pn.PlaceList.add(pBREnter3);

        DataString pedBR1Enter = new DataString(); // Peds 3
        pedBR1Enter.SetName("PedBr1Enter");
        pn.PlaceList.add(pedBR1Enter);

        DataString usrReqBREW = new DataString(); // userreq3
        usrReqBREW.SetName("UserReqBR1EW");
        pn.PlaceList.add(usrReqBREW);

        DataString Sem2BRW = new DataString(); // ps3
        Sem2BRW.SetName("Sem2Br");
        pn.PlaceList.add(Sem2BRW);

        DataTransfer OPReqBREW = new DataTransfer(); // Op3
        OPReqBREW.SetName("OPReqBREW");
        OPReqBREW.Value = new TransferOperation("localhost", "1081" , "UserReq");
        pn.PlaceList.add(OPReqBREW);
        
        //PI1 middle Intersection

        DataCarQueue PI1 = new DataCarQueue();
        PI1.Value.Size = 1;
        PI1.SetName("PI1");
        pn.PlaceList.add(PI1);

        //PI2 middle Intersection

        DataCarQueue PI2 = new DataCarQueue();
        PI2.Value.Size = 1;
        PI2.SetName("PI2");
        pn.PlaceList.add(PI2);

        //PI3 middle Intersection

        DataCarQueue PI3 = new DataCarQueue();
        PI3.Value.Size = 1;
        PI3.SetName("PI3");
        pn.PlaceList.add(PI3);

        //-----------t1-------- For adding to Car Queue

        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "t1";
        t1.InputPlaceName.add("p1");
        t1.InputPlaceName.add("p2");

        Condition T1Ct1 = new Condition(t1, "p1", TransitionCondition.NotNull);
        Condition T1Ct2 = new Condition(t1, "p2", TransitionCondition.CanAddCars);
        T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct1;
        grdT1.Activations.add(new Activation(t1, "p1", TransitionOperation.AddElement, "p2"));
        t1.GuardMappingList.add(grdT1);

        t1.Delay = 0;
        pn.Transitions.add(t1);

        //--- t2- SEMAPHORE with Pedestrian Input
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "t2";
        t2.InputPlaceName.add("p2");
        t2.InputPlaceName.add("Sem1");
        t2.InputPlaceName.add("UserReqVG");
        t2.InputPlaceName.add("Pedestrians");

        Condition T2Ct1 = new Condition(t2, "Sem1", TransitionCondition.IsNull);
        Condition T2Ct2 = new Condition(t2, "p2", TransitionCondition.HaveCar);
        T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct2;
        grdT2.Activations.add(new Activation(t2, "p2", TransitionOperation.PopElementWithoutTarget, "p3"));
        grdT2.Activations.add(new Activation(t2, "Pedestrians", TransitionOperation.Move, "Pedestrians"));

        t2.GuardMappingList.add(grdT2);

        Condition T2Ct3 = new Condition(t2, "UserReqVG", TransitionCondition.NotNull);

        GuardMapping grd2T2 = new GuardMapping();
        grd2T2.condition = T2Ct3;

        grd2T2.Activations.add(new Activation(t2, "Sem1", TransitionOperation.Move, "Sem1"));
        grd2T2.Activations.add(new Activation(t2, "Pedestrians", TransitionOperation.Move, "Pedestrians"));
        grd2T2.Activations.add(new Activation(t2, "UserReq", TransitionOperation.SendOverNetwork, "OPReq"));

        t2.GuardMappingList.add(grd2T2);


        t2.Delay = 5;
        pn.Transitions.add(t2);

        //----PI1 Intersection entering Transition with Vasile Goldis
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "ti3";
        t3.InputPlaceName.add("p3");
        t3.InputPlaceName.add("PI1");

        Condition T13Ct1 = new Condition(t3, "p3", TransitionCondition.NotNull);
        Condition T13Ct2 = new Condition(t3, "PI1", TransitionCondition.CanAddCars);
        T13Ct1.SetNextCondition(LogicConnector.AND, T13Ct2);

        GuardMapping grdT13 = new GuardMapping();
        grdT13.condition = T13Ct1;
        grdT13.Activations.add(new Activation(t3, "p3", TransitionOperation.AddElement, "PI1"));
        t3.GuardMappingList.add(grdT13);

        t3.Delay = 0;
        pn.Transitions.add(t3);
        
        //----- PI1 Intersection exit with Bulevardul Revolutiei 1989
        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "T_ExtBR";
        t4.InputPlaceName.add("PI1");
        t4.InputPlaceName.add("pBR1");
        t4.IsAsync = true;

        Condition T_out2Ct1 = new Condition(t4, "PI1", TransitionCondition.NotNull);
        Condition T_out2Ct2 = new Condition(t4, "pBR1", TransitionCondition.CanAddCars);
        T_out2Ct1.SetNextCondition(LogicConnector.AND, T_out2Ct2);

        GuardMapping grdT_out2 = new GuardMapping();
        grdT_out2.condition = T_out2Ct1;
        grdT_out2.Activations.add(new Activation(t4,"PI1",TransitionOperation.PopElementWithTargetToQueue,"pBR1" ));
        t4.GuardMappingList.add(grdT_out2);

        t4.Delay = 0;
        pn.Transitions.add(t4);

        /*
        // ---- Bulevardul Mihai Eminescu ----

        DataCar p7 = new DataCar();
        p7.SetName("p7");
        pn.PlaceList.add(p7);

        DataCar p8 = new DataCar();
        p8.SetName("p8");
        pn.PlaceList.add(p8);



        // ----
*/
        System.out.println("Lanes_Intersection started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}
