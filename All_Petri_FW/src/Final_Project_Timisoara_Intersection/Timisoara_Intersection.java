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

        DataString red = new DataString();
        red.SetName("red");
        red.SetValue("red");
        pn.ConstantPlaceList.add(red);

        DataString green = new DataString();
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString yellow = new DataString();
        yellow.SetName("yellow");
        yellow.SetValue("yellow");
        pn.ConstantPlaceList.add(yellow);


        //FELIXAO
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
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
        PI1.Value.Size = 3;
        PI1.SetName("PI1");
        pn.PlaceList.add(PI1);

        //PI2 middle Intersection

        DataCarQueue PI2 = new DataCarQueue();
        PI2.Value.Size = 3;
        PI2.SetName("PI2");
        pn.PlaceList.add(PI2);

        //PI3 middle Intersection

        DataCarQueue PI3 = new DataCarQueue();
        PI3.Value.Size = 3;
        PI3.SetName("PI3");
        pn.PlaceList.add(PI3);

        // Tram Exit line ->E
        DataCarQueue TramExit = new DataCarQueue(); // p11
        TramExit.Value.Size = 2;
        TramExit.SetName("TramExit");
        pn.PlaceList.add(TramExit);

        // Tram Entering line ->W
        DataCar TramEnter1 = new DataCar(); // TramEnter12
        TramEnter1.SetName("TramEnter1");
        pn.PlaceList.add(TramEnter1);

        DataCarQueue TramEnter2 = new DataCarQueue(); // p11
        TramEnter2.Value.Size = 1;
        TramEnter2.SetName("TramEnter2");
        pn.PlaceList.add(TramEnter2);

        DataCar TramEnter3 = new DataCar(); // p10
        TramEnter3.SetName("TramEnter3");
        pn.PlaceList.add(TramEnter3);

        DataString pTramPedSem = new DataString(); // ps3
        pTramPedSem.SetName("TramPedSem");
        pn.PlaceList.add(pTramPedSem);

        DataString perTram1Enter = new DataString(); // Peds 3
        perTram1Enter.SetName("PedTramEnter");
        pn.PlaceList.add(perTram1Enter);

        DataString usrReqTram = new DataString(); // userreq3
        usrReqTram.SetName("UserReqTram");
        pn.PlaceList.add(usrReqTram);


        DataTransfer OPReqTram = new DataTransfer(); // Op3
        OPReqTram.SetName("OPReqTram");
        OPReqTram.Value = new TransferOperation("localhost", "1081" , "UserReq");
        pn.PlaceList.add(OPReqTram);


        // Bulevardul Revolutiei 1989 -> E


        DataCar p1EstBRMid = new DataCar(); // p1EstBRMid2
        p1EstBRMid.SetName("p1EstBRMid");
        pn.PlaceList.add(p1EstBRMid);

        DataCarQueue p2EstBRMid = new DataCarQueue(); // p11
        p2EstBRMid.Value.Size = 1;
        p2EstBRMid.SetName("p2EstBRMid");
        pn.PlaceList.add(p2EstBRMid);

        DataCar p3EstBRMid = new DataCar(); // p10
        p3EstBRMid.SetName("p3EstBRMid");
        pn.PlaceList.add(p3EstBRMid);

        DataString pSemBREstMid = new DataString(); // Peds 3
        pSemBREstMid.SetName("SemEstMidJos");
        pSemBREstMid.SetValue("red");
        pn.PlaceList.add(pSemBREstMid);

        DataCarQueue p1EstExitBRMid = new DataCarQueue(); // p11
        p1EstExitBRMid.Value.Size = 1;
        p1EstExitBRMid.SetName("p1EstExitBRMid");
        pn.PlaceList.add(p1EstExitBRMid);

        DataCarQueue p1MihaiExit = new DataCarQueue(); // p11
        p1MihaiExit.Value.Size = 1;
        p1MihaiExit.SetName("p1MihaiExit");
        pn.PlaceList.add(p1MihaiExit);

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

        t1.Delay = 1;
        pn.Transitions.add(t1);

        //--- t2- SEMAPHORE with Pedestrian Input
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "t2";
        t2.InputPlaceName.add("p2");
        t2.InputPlaceName.add("Sem1");
        // t2.InputPlaceName.add("UserReqVG");
        // t2.InputPlaceName.add("Pedestrians");

        Condition T2Ct1 = new Condition(t2, "Sem1", TransitionCondition.Equal,"green");
        Condition T2Ct2 = new Condition(t2, "p2", TransitionCondition.HaveCar);
        T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct1;
        grdT2.Activations.add(new Activation(t2, "p2", TransitionOperation.PopElementWithoutTarget, "p3"));
        grdT2.Activations.add(new Activation(t2, "Sem1", TransitionOperation.Move, "Sem1"));

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

        t3.Delay = 1;
        pn.Transitions.add(t3);

        //----- PI1 Intersection exit with Bulevardul Revolutiei 1989
        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "T_ExtBR";
        t4.InputPlaceName.add("PI1");
        t4.InputPlaceName.add("pBR1");
        //t4.IsAsync = true;

        Condition T_out2Ct1 = new Condition(t4, "PI1", TransitionCondition.HaveCarForMe);
        Condition T_out2Ct2 = new Condition(t4, "pBR1", TransitionCondition.CanAddCars);
        T_out2Ct1.SetNextCondition(LogicConnector.AND, T_out2Ct2);

        GuardMapping grdT_out2 = new GuardMapping();
        grdT_out2.condition = T_out2Ct1;
        grdT_out2.Activations.add(new Activation(t4,"PI1",TransitionOperation.PopElementWithTargetToQueue,"pBR1" ));
        t4.GuardMappingList.add(grdT_out2);

        t4.Delay =1;
        pn.Transitions.add(t4);


        //--- t1BRW Bulevadrul Revolutiei 1989 spre W
        PetriTransition t1BRW = new PetriTransition(pn);
        t1BRW.TransitionName = "t1BRW";
        t1BRW.InputPlaceName.add("pBREnter1");
        t1BRW.InputPlaceName.add("pBREnter2");

        Condition T1BRWCt1= new Condition(t1BRW, "pBREnter1", TransitionCondition.NotNull);
        Condition T1BRWCt2 = new Condition(t1BRW, "pBREnter2", TransitionCondition.CanAddCars);
        T1BRWCt1.SetNextCondition(LogicConnector.AND, T1BRWCt2);

        GuardMapping grdT1BRW = new GuardMapping();
        grdT1BRW.condition = T1BRWCt1;
        grdT1BRW.Activations.add(new Activation(t1BRW, "pBREnter1", TransitionOperation.AddElement, "pBREnter2"));
        t1BRW.GuardMappingList.add(grdT1BRW);

        t1BRW.Delay = 1;
        pn.Transitions.add(t1BRW);

        //--- t2- SEMAPHORE with Pedestrian Input Bulevadrul Revolutiei 1989 spre W
        PetriTransition t2BRW = new PetriTransition(pn);
        t2BRW.TransitionName = "t2BRW";
        t2BRW.InputPlaceName.add("pBREnter2");
        t2BRW.InputPlaceName.add("Sem2Br");
        //t2BRW.InputPlaceName.add("UserReqBR1EW");
        // t2BRW.InputPlaceName.add("PedBr1Enter");

        Condition T2BRWCt1 = new Condition(t2BRW, "Sem2Br", TransitionCondition.Equal,"green");
        Condition T2BRWCt2 = new Condition(t2BRW, "pBREnter2", TransitionCondition.HaveCar);
        T2BRWCt1.SetNextCondition(LogicConnector.AND, T2BRWCt2);

        GuardMapping grdT2BRW = new GuardMapping();
        grdT2BRW.condition = T2BRWCt1;
        grdT2BRW.Activations.add(new Activation(t2BRW, "pBREnter2", TransitionOperation.PopElementWithoutTarget, "pBREnter3"));
        grdT2BRW.Activations.add(new Activation(t2BRW, "Sem2Br", TransitionOperation.Move, "Sem2Br"));

        t2BRW.GuardMappingList.add(grdT2BRW);

        Condition T2BRWCt1Prio = new Condition(t2BRW, "pBREnter2", TransitionCondition.HavePriorityCar);

        GuardMapping grdT2BRWPrio = new GuardMapping();
        grdT2BRWPrio.condition = T2BRWCt1Prio;
        grdT2BRWPrio.Activations.add(new Activation(t2BRW, "pBREnter2", TransitionOperation.PopElementWithoutTarget, "pBREnter3"));

        t2BRW.GuardMappingList.add(grdT2BRWPrio);

        t2BRW.Delay = 5;
        pn.Transitions.add(t2BRW);

        //----PI1 Intersection entering Transition with Bulevardul Revolutiei 1989
        PetriTransition t3BRW = new PetriTransition(pn);
        t3BRW.TransitionName = "t3BRW";
        t3BRW.InputPlaceName.add("pBREnter3");
        t3BRW.InputPlaceName.add("PI1");

        Condition T3BRWCt1 = new Condition(t3BRW, "pBREnter3", TransitionCondition.NotNull);
        Condition T3BRWCt2 = new Condition(t3BRW, "PI1", TransitionCondition.CanAddCars);
        T3BRWCt1.SetNextCondition(LogicConnector.AND, T3BRWCt2);

        GuardMapping grdT3BRW = new GuardMapping();
        grdT3BRW.condition = T3BRWCt1;
        grdT3BRW.Activations.add(new Activation(t3BRW, "pBREnter3", TransitionOperation.AddElement, "PI1"));
        t3BRW.GuardMappingList.add(grdT3BRW);

        t3BRW.Delay = 1;
        pn.Transitions.add(t3BRW);

        // BR North with Tram Line intersection
        PetriTransition tBRNTL = new PetriTransition(pn);
        tBRNTL.TransitionName = "tBRNTL";
        tBRNTL.InputPlaceName.add("PI1");
        tBRNTL.InputPlaceName.add("PI2");

        Condition tBRNTLCt1= new Condition(tBRNTL, "PI1", TransitionCondition.HaveCarForMe);
        Condition tBRNTLCt2 = new Condition(tBRNTL, "PI2", TransitionCondition.CanAddCars);
        tBRNTLCt1.SetNextCondition(LogicConnector.AND, tBRNTLCt2);

        GuardMapping grdTBRNTL= new GuardMapping();
        grdTBRNTL.condition = tBRNTLCt1;
        grdTBRNTL.Activations.add(new Activation(tBRNTL, "PI1", TransitionOperation.PopElementWithTargetToQueue, "PI2"));
        tBRNTL.GuardMappingList.add(grdTBRNTL);

        tBRNTL.Delay=1;
        pn.Transitions.add(tBRNTL);

        /// PI2 PI3
        PetriTransition tBRSTL = new PetriTransition(pn);
        tBRSTL.TransitionName = "tBRSTL";
        tBRSTL.InputPlaceName.add("PI2");
        tBRSTL.InputPlaceName.add("PI3");

        Condition tBRSTLCt1= new Condition(tBRSTL, "PI2", TransitionCondition.HaveCarForMe);
        Condition tBRSTLCt2 = new Condition(tBRSTL, "PI3", TransitionCondition.CanAddCars);
        tBRSTLCt1.SetNextCondition(LogicConnector.AND, tBRSTLCt2);

        GuardMapping grdTBRSTL= new GuardMapping();
        grdTBRSTL.condition = tBRSTLCt1;
        grdTBRSTL.Activations.add(new Activation(tBRSTL, "PI2", TransitionOperation.PopElementWithTargetToQueue, "PI3"));
        tBRSTL.GuardMappingList.add(grdTBRSTL);

        tBRSTL.Delay=1;
        pn.Transitions.add(tBRSTL);

        //Tram line Exit transition
        PetriTransition tTramLineExit = new PetriTransition(pn);
        tTramLineExit.TransitionName = "tTramLineExit";
        tTramLineExit.InputPlaceName.add("TramExit");
        tTramLineExit.InputPlaceName.add("PI2");

        Condition tTramLineExitCt1= new Condition(tTramLineExit, "PI2", TransitionCondition.HaveCarForMe);
        Condition tTramLineExitCt2 = new Condition(tTramLineExit, "TramExit", TransitionCondition.CanAddCars);
        Condition tTramLineExitCt3 = new Condition(tTramLineExit, "PI2", TransitionCondition.HaveBus);
        tTramLineExitCt2.SetNextCondition(LogicConnector.AND,tTramLineExitCt3);
        tTramLineExitCt1.SetNextCondition(LogicConnector.AND, tTramLineExitCt2);

        GuardMapping grdTramLineExit= new GuardMapping();
        grdTramLineExit.condition = tTramLineExitCt1;
        grdTramLineExit.Activations.add(new Activation(tTramLineExit, "PI2", TransitionOperation.PopElementWithTargetToQueue, "TramExit"));
        tTramLineExit.GuardMappingList.add(grdTramLineExit);

        tTramLineExit.Delay=1;
        pn.Transitions.add(tTramLineExit);

        //--- Tram station through intersection
        PetriTransition tTramLineCenter = new PetriTransition(pn);
        tTramLineCenter.TransitionName = "tTramLineCenter";
        tTramLineCenter.InputPlaceName.add("TramEnter1");
        tTramLineCenter.InputPlaceName.add("TramEnter2");

        Condition TTramLineCenterCt1= new Condition(tTramLineCenter, "TramEnter1", TransitionCondition.NotNull);
        Condition TTramLineCenterCt2 = new Condition(tTramLineCenter, "TramEnter2", TransitionCondition.CanAddCars);
        TTramLineCenterCt1.SetNextCondition(LogicConnector.AND, TTramLineCenterCt2);

        GuardMapping grdTTramLineCenter = new GuardMapping();
        grdTTramLineCenter.condition = TTramLineCenterCt1;
        grdTTramLineCenter.Activations.add(new Activation(tTramLineCenter, "TramEnter1", TransitionOperation.AddElement, "TramEnter2"));
        tTramLineCenter.GuardMappingList.add(grdTTramLineCenter);

        tTramLineCenter.Delay = 1;
        pn.Transitions.add(tTramLineCenter);

        //--- t2- SEMAPHORE with Pedestrian Input Bulevadrul Revolutiei 1989 spre W
        PetriTransition tSemTramLine = new PetriTransition(pn);
        tSemTramLine.TransitionName = "tSemTramLine";
        tSemTramLine.InputPlaceName.add("TramEnter2");
        tSemTramLine.InputPlaceName.add("Sem2Br");
        tSemTramLine.InputPlaceName.add("UserReqTram");
        tSemTramLine.InputPlaceName.add("PedTramEnter");

        Condition TSemTramLineCt1 = new Condition(tSemTramLine, "Sem2Br", TransitionCondition.Equal,"green");
        Condition TSemTramLineCt2 = new Condition(tSemTramLine, "TramEnter2", TransitionCondition.HaveCar);
        TSemTramLineCt1.SetNextCondition(LogicConnector.AND, TSemTramLineCt2);

        GuardMapping grdTSemTramLine = new GuardMapping();
        grdTSemTramLine.condition = TSemTramLineCt1;
        grdTSemTramLine.Activations.add(new Activation(tSemTramLine, "TramEnter2", TransitionOperation.PopElementWithoutTarget, "TramEnter3"));
        grdTSemTramLine.Activations.add(new Activation(tSemTramLine, "PedTramEnter", TransitionOperation.Move, "PedTramEnter"));

        tSemTramLine.GuardMappingList.add(grdTSemTramLine);

        Condition TSemTramLineCt3 = new Condition(tSemTramLine, "UserReqTram", TransitionCondition.NotNull);

        GuardMapping grd2TSemTramLine = new GuardMapping();
        grd2TSemTramLine.condition = TSemTramLineCt3;

        grd2TSemTramLine.Activations.add(new Activation(tSemTramLine, "Sem2Br", TransitionOperation.Move, "Sem2Br"));
        grd2TSemTramLine.Activations.add(new Activation(tSemTramLine, "PedTramEnter", TransitionOperation.Move, "PedTramEnter"));
        grd2TSemTramLine.Activations.add(new Activation(tSemTramLine, "UserReqTram", TransitionOperation.SendOverNetwork, "UserReqTram"));

        tSemTramLine.GuardMappingList.add(grd2TSemTramLine);

        tSemTramLine.Delay = 1;
        pn.Transitions.add(tSemTramLine);

        //----PI1 Intersection entering Transition with Bulevardul Revolutiei 1989
        PetriTransition tTramStationExit= new PetriTransition(pn);
        tTramStationExit.TransitionName = "tTramStationExit";
        tTramStationExit.InputPlaceName.add("TramEnter3");
        tTramStationExit.InputPlaceName.add("PI2");

        Condition tTramStationExitCt1 = new Condition(tTramStationExit, "TramEnter3", TransitionCondition.NotNull);
        Condition tTramStationExitCt2 = new Condition(tTramStationExit, "PI2", TransitionCondition.CanAddCars);
        tTramStationExitCt1.SetNextCondition(LogicConnector.AND, tTramStationExitCt2);

        GuardMapping grdtTramStationExit = new GuardMapping();
        grdtTramStationExit.condition = tTramStationExitCt1;
        grdtTramStationExit.Activations.add(new Activation(tTramStationExit, "TramEnter3", TransitionOperation.AddElement, "PI2"));
        tTramStationExit.GuardMappingList.add(grdtTramStationExit);

        tTramStationExit.Delay = 1;
        pn.Transitions.add(tTramStationExit);


        //// Br est mid jos

        // INtrare
        PetriTransition t1BREMid = new PetriTransition(pn);
        t1BREMid.TransitionName = "t1BREMid";
        t1BREMid.InputPlaceName.add("p1EstBRMid");
        t1BREMid.InputPlaceName.add("p2EstBRMid");

        Condition T1BREMidCt1= new Condition(t1BREMid, "p1EstBRMid", TransitionCondition.NotNull);
        Condition T1BREMidCt2 = new Condition(t1BREMid, "p2EstBRMid", TransitionCondition.CanAddCars);
        T1BREMidCt1.SetNextCondition(LogicConnector.AND, T1BREMidCt2);

        GuardMapping grdT1BREMid = new GuardMapping();
        grdT1BREMid.condition = T1BREMidCt1;
        grdT1BREMid.Activations.add(new Activation(t1BREMid, "p1EstBRMid", TransitionOperation.AddElement, "p2EstBRMid"));
        t1BREMid.GuardMappingList.add(grdT1BREMid);

        t1BREMid.Delay = 1;
        pn.Transitions.add(t1BREMid);

        // Semafor

        PetriTransition tSemEstMid = new PetriTransition(pn);
        tSemEstMid.TransitionName = "tSemEstMid";
        tSemEstMid.InputPlaceName.add("p2EstBRMid");
        tSemEstMid.InputPlaceName.add("SemEstMidJos");

        Condition TSemEstMidCt1 = new Condition(tSemEstMid, "SemEstMidJos", TransitionCondition.Equal,"green");
        Condition TSemEstMidCt2 = new Condition(tSemEstMid, "p2EstBRMid", TransitionCondition.HaveCar);
        TSemEstMidCt1.SetNextCondition(LogicConnector.AND, TSemEstMidCt2);

        GuardMapping grdTSemEstMid = new GuardMapping();
        grdTSemEstMid.condition = TSemEstMidCt1;
        grdTSemEstMid.Activations.add(new Activation(tSemEstMid, "p2EstBRMid", TransitionOperation.PopElementWithoutTarget, "p3EstBRMid"));
        grdTSemEstMid.Activations.add(new Activation(tSemEstMid, "SemEstMidJos", TransitionOperation.Move, "SemEstMidJos"));

        tSemEstMid.GuardMappingList.add(grdTSemEstMid);

        Condition TSemEstMidCt3 = new Condition(tSemEstMid, "p2EstBRMid", TransitionCondition.HavePriorityCar);
        GuardMapping grdTSemEstMidPrio = new GuardMapping();
        grdTSemEstMidPrio.condition = TSemEstMidCt3;
        grdTSemEstMidPrio.Activations.add(new Activation(tSemEstMid, "p2EstBRMid", TransitionOperation.PopElementWithoutTarget, "p3EstBRMid"));
        tSemEstMid.GuardMappingList.add(grdTSemEstMidPrio);


        tSemEstMid.Delay = 1;
        pn.Transitions.add(tSemEstMid);

        //Intrare PI3 BR Est

        PetriTransition TEstMidPI3 = new PetriTransition(pn);
        TEstMidPI3.TransitionName = "TEstMidPI3";
        TEstMidPI3.InputPlaceName.add("p3EstBRMid");
        TEstMidPI3.InputPlaceName.add("PI3");

        Condition TEstMidPI3Ct1 = new Condition(TEstMidPI3, "PI3", TransitionCondition.CanAddCars);
        Condition TEstMidPI3Ct2 = new Condition(TEstMidPI3, "p3EstBRMid", TransitionCondition.NotNull);
        TEstMidPI3Ct1.SetNextCondition(LogicConnector.AND, TEstMidPI3Ct2);

        GuardMapping grdTEstMidPI3 = new GuardMapping();
        grdTEstMidPI3.condition = TEstMidPI3Ct1;
        grdTEstMidPI3.Activations.add(new Activation(TEstMidPI3, "p3EstBRMid", TransitionOperation.AddElement, "PI3"));

        TEstMidPI3.GuardMappingList.add(grdTEstMidPI3);


        TEstMidPI3.Delay = 1;
        pn.Transitions.add(TEstMidPI3);

        // Iesire PI3 BR Est

        PetriTransition TExitPI3Mid = new PetriTransition(pn);
        TExitPI3Mid.TransitionName = "TExitPI3Mid";
        TExitPI3Mid.InputPlaceName.add("p1EstExitBRMid");
        TExitPI3Mid.InputPlaceName.add("PI3");

        Condition TExitPI3MidCt1 = new Condition(TExitPI3Mid, "p1EstExitBRMid", TransitionCondition.CanAddCars);
        Condition TExitPI3MidCt2 = new Condition(TExitPI3Mid, "PI3", TransitionCondition.HaveCarForMe);
        TExitPI3MidCt1.SetNextCondition(LogicConnector.AND, TExitPI3MidCt2);

        GuardMapping grdTExitPI3Mid = new GuardMapping();
        grdTExitPI3Mid.condition = TExitPI3MidCt1;
        grdTExitPI3Mid.Activations.add(new Activation(TExitPI3Mid, "PI3", TransitionOperation.PopElementWithTargetToQueue, "p1EstExitBRMid"));

        TExitPI3Mid.GuardMappingList.add(grdTExitPI3Mid);


        TExitPI3Mid.Delay = 1;
        pn.Transitions.add(TExitPI3Mid);


        //Iesire Mihai Eminescu

        PetriTransition TExitPI3Mihai = new PetriTransition(pn);
        TExitPI3Mihai.TransitionName = "TExitPI3Mihai";
        TExitPI3Mihai.InputPlaceName.add("p1MihaiExit");
        TExitPI3Mihai.InputPlaceName.add("PI3");

        Condition TExitPI3MihaiCt1 = new Condition(TExitPI3Mihai, "p1MihaiExit", TransitionCondition.CanAddCars);
        Condition TExitPI3MihaiCt2 = new Condition(TExitPI3Mihai, "PI3", TransitionCondition.HaveCarForMe);
        TExitPI3MihaiCt1.SetNextCondition(LogicConnector.AND, TExitPI3MihaiCt2);

        GuardMapping grdTExitPI3Mihai = new GuardMapping();
        grdTExitPI3Mihai.condition = TExitPI3MihaiCt1;
        grdTExitPI3Mihai.Activations.add(new Activation(TExitPI3Mihai, "PI3", TransitionOperation.PopElementWithTargetToQueue, "p1MihaiExit"));

        TExitPI3Mihai.GuardMappingList.add(grdTExitPI3Mihai);


        TExitPI3Mihai.Delay = 1;
        pn.Transitions.add(TExitPI3Mihai);




















        /// Right Intersection

        //Iesire Nicu Filipescu
        DataCar p1NF = new DataCar(); // p1NF2
        p1NF.SetName("p1NF");
        pn.PlaceList.add(p1NF);

        DataCarQueue p2NF = new DataCarQueue(); // p11
        p2NF.Value.Size = 1;
        p2NF.SetName("p2NF");
        pn.PlaceList.add(p2NF);

        DataCar p3NF = new DataCar(); // p10
        p3NF.SetName("p3NF");
        pn.PlaceList.add(p3NF);

        DataString p4NF = new DataString(); // Peds 3
        p4NF.SetName("PedNF");
        pn.PlaceList.add(p4NF);

        DataString p5NF = new DataString(); // userreq3
        p5NF.SetName("UserReqNF");
        pn.PlaceList.add(p5NF);

        DataString p6NF = new DataString(); // ps3
        p6NF.SetName("SemNF");
        pn.PlaceList.add(p6NF);

        DataTransfer OPReqNF = new DataTransfer(); // Op3
        OPReqNF.SetName("OPReqNF");
        OPReqNF.Value = new TransferOperation("localhost", "1081" , "UserReq");
        pn.PlaceList.add(OPReqNF);

        // Bulevardul Revolutiei 1989

        // Exit Lane-->W
        DataCarQueue pBRExtFromRight = new DataCarQueue();
        pBRExtFromRight.Value.Size=3;
        pBRExtFromRight.SetName("pBRExtFromRight");
        pn.PlaceList.add(pBRExtFromRight);

        DataCar pBR2Right = new DataCar();
        pBR2Right.SetName("pBR2Right");
        pn.PlaceList.add(pBR2Right);

        // Entering lane -->W

        DataCar pBREnterRight1 = new DataCar();
        pBREnterRight1.SetName("pBREnter1Right");
        pn.PlaceList.add(pBREnterRight1);

        DataCarQueue pBREnterRight2 = new DataCarQueue();
        pBREnterRight2.Value.Size = 1;
        pBREnterRight2.SetName("pBREnter2Right");
        pn.PlaceList.add(pBREnterRight2);

        DataCar pBREnterRight3 = new DataCar();
        pBREnterRight3.SetName("pBREnter3Right");
        pn.PlaceList.add(pBREnterRight3);

        DataString pedBRRightEnter = new DataString();
        pedBRRightEnter.SetName("PedBrRightEnter");
        pn.PlaceList.add(pedBRRightEnter);

        DataString usrReqBR1TramRight = new DataString();
        usrReqBR1TramRight.SetName("UserReqBR1TramRight");
        pn.PlaceList.add(usrReqBR1TramRight);

        DataString SemBR1EnterRight = new DataString();
        SemBR1EnterRight.SetName("SemBrEnterRight");
        pn.PlaceList.add(SemBR1EnterRight);

        DataTransfer OPReqBREnterRight = new DataTransfer();
        OPReqBREnterRight.SetName("OPReqBREnterRight");
        OPReqBREnterRight.Value = new TransferOperation("localhost", "1081" , "UserReq");
        pn.PlaceList.add(OPReqBREnterRight);

        // Bulevardul Revolutiei Est Right most intersecrion

        DataCar pBREastRightE1 = new DataCar();
        pBREastRightE1 .SetName("pBREastRightEn1");
        pn.PlaceList.add(pBREastRightE1);

        DataCarQueue pBREastRightE2 = new DataCarQueue(); // p11
        pBREastRightE2.Value.Size = 1;
        pBREastRightE2.SetName("pBREastRightEn2");
        pn.PlaceList.add(pBREastRightE2);

        DataCar pBREastRightE3 = new DataCar(); // p10
        pBREastRightE3.SetName("pBREastRightEn3");
        pn.PlaceList.add(pBREastRightE3);

        DataString p6BREastRight4 = new DataString(); // ps3
        p6BREastRight4.SetName("SemBREastRightEn");
        pn.PlaceList.add(p6BREastRight4);

        //Bulevardul Revolutiei Est Right most inetsection exit
        DataCarQueue pBREastRightEx1 = new DataCarQueue();
        pBREastRightEx1.Value.Size = 1;
        pBREastRightEx1.SetName("pBREastRightEx1");
        pn.PlaceList.add(pBREastRightEx1);

        DataCar pBREastRightEx2 = new DataCar();
        pBREastRightEx2.SetName("pBREastRightEx2");
        pn.PlaceList.add(pBREastRightEx2);

        //PI1 middle Intersection

        DataCarQueue PI1Right = new DataCarQueue();
        PI1Right.Value.Size = 3;
        PI1Right.SetName("PI1Right");
        pn.PlaceList.add(PI1Right);

        //PI2 middle Intersection

        DataCarQueue PI2Right = new DataCarQueue();
        PI2Right.Value.Size = 3;
        PI2Right.SetName("PI2Right");
        pn.PlaceList.add(PI2Right);

        //PI3 middle Intersection

        DataCarQueue PI3Right = new DataCarQueue();
        PI3Right.Value.Size = 3;
        PI3Right.SetName("PI3Right");
        pn.PlaceList.add(PI3Right);

        // Tram Exit line ->E
        DataCarQueue TramExitRight = new DataCarQueue(); // p11
        TramExitRight.Value.Size = 2;
        TramExitRight.SetName("TramExitRight");
        pn.PlaceList.add(TramExitRight);

        // Tram Entering line ->W
        DataCar TramEnterRight1 = new DataCar(); // TramEnterRight12
        TramEnterRight1.SetName("TramEnter1Right");
        pn.PlaceList.add(TramEnterRight1);

        DataCarQueue TramEnterRight2 = new DataCarQueue(); // p11
        TramEnterRight2.Value.Size = 1;
        TramEnterRight2.SetName("TramEnter2Right");
        pn.PlaceList.add(TramEnterRight2);

        DataCar TramEnterRight3 = new DataCar(); // p10
        TramEnterRight3.SetName("TramEnter3Right");
        pn.PlaceList.add(TramEnterRight3);

        DataString pedTramRightEnter = new DataString(); // Peds 3
        pedTramRightEnter.SetName("PedTramEnterRight");
        pn.PlaceList.add(pedTramRightEnter);

        DataString usrReqTramRight = new DataString(); // userreq3
        usrReqTramRight.SetName("UserReqTramRight");
        pn.PlaceList.add(usrReqTramRight);


        DataTransfer OPReqTramRight = new DataTransfer(); // Op3
        OPReqTramRight.SetName("OPReqTramRight");
        OPReqTramRight.Value = new TransferOperation("localhost", "1084" , "UserReq");
        pn.PlaceList.add(OPReqTramRight);

        // Bulevardul Revolutiei 1989 -> E

        //-----------t1-------- For adding to Car Queue

        PetriTransition t1Right = new PetriTransition(pn);
        t1Right.TransitionName = "t1Right";
        t1Right.InputPlaceName.add("p1NF");
        t1Right.InputPlaceName.add("p2NF");

        Condition T1RightCt1 = new Condition(t1Right, "p1NF", TransitionCondition.NotNull);
        Condition T1RightCt2 = new Condition(t1Right, "p2NF", TransitionCondition.CanAddCars);
        T1RightCt1.SetNextCondition(LogicConnector.AND, T1RightCt2);

        GuardMapping grdT1Right = new GuardMapping();
        grdT1Right.condition = T1RightCt1;
        grdT1Right.Activations.add(new Activation(t1Right, "p1NF", TransitionOperation.AddElement, "p2NF"));
        t1Right.GuardMappingList.add(grdT1Right);

        t1Right.Delay = 1;
        pn.Transitions.add(t1Right);

        //--- t2- SEMAPHORE with Pedestrian Input
        PetriTransition t2Right = new PetriTransition(pn);
        t2Right.TransitionName = "t2Right";
        t2Right.InputPlaceName.add("p2NF");
        t2Right.InputPlaceName.add("SemNF");


        Condition T2RightCt1 = new Condition(t2Right, "SemNF", TransitionCondition.Equal,"green");
        Condition T2RightCt2 = new Condition(t2Right, "p2NF", TransitionCondition.HaveCar);
        T2RightCt1.SetNextCondition(LogicConnector.AND, T2RightCt2);

        GuardMapping grdT2Right = new GuardMapping();
        grdT2Right.condition = T2RightCt1;
        grdT2Right.Activations.add(new Activation(t2Right, "p2NF", TransitionOperation.PopElementWithoutTarget, "p3NF"));
        grdT2Right.Activations.add(new Activation(t2Right, "SemNF", TransitionOperation.Move, "SemNF"));
        t2Right.GuardMappingList.add(grdT2Right);

        Condition grdT2RightPrioCt1 =new Condition(t2Right, "p2NF", TransitionCondition.HavePriorityCar);
        GuardMapping grdT2RightPrio = new GuardMapping();
        grdT2RightPrio.condition = grdT2RightPrioCt1;
        grdT2RightPrio.Activations.add(new Activation(t2Right, "p2NF", TransitionOperation.PopElementWithoutTarget, "p3NF"));
        t2Right.GuardMappingList.add(grdT2RightPrio);


        t2Right.Delay = 5;
        pn.Transitions.add(t2Right);

        //----PI1Right Intersection entering Transition with Nicolaie Filipescu
        PetriTransition t3Right = new PetriTransition(pn);
        t3Right.TransitionName = "t3Right";
        t3Right.InputPlaceName.add("p3NF");
        t3Right.InputPlaceName.add("PI1Right");

        Condition T3RightCt1 = new Condition(t3Right, "p3NF", TransitionCondition.NotNull);
        Condition T3RightCt2 = new Condition(t3Right, "PI1Right", TransitionCondition.CanAddCars);
        T3RightCt1.SetNextCondition(LogicConnector.AND, T3RightCt2);

        GuardMapping grdT3Right = new GuardMapping();
        grdT3Right.condition = T3RightCt1;
        grdT3Right.Activations.add(new Activation(t3Right, "p3NF", TransitionOperation.AddElement, "PI1Right"));
        t3Right.GuardMappingList.add(grdT3Right);

        t3Right.Delay = 1;
        pn.Transitions.add(t3Right);

        //----- PI1Right Intersection exit with Bulevardul Revolutiei 1989
        /*
        PetriTransition tExtBRFromRight = new PetriTransition(pn);
        tExtBRFromRight.TransitionName = "tExtBRFromRight";
        tExtBRFromRight.InputPlaceName.add("PI1Right");
        tExtBRFromRight.InputPlaceName.add("pBR1Right");

        Condition tExtBRFromRightCt1= new Condition(tExtBRFromRight, "PI1Right", TransitionCondition.HaveCarForMe);
        Condition tExtBRFromRightCt2 = new Condition(tExtBRFromRight, "pBR1Right", TransitionCondition.CanAddCars);
        tExtBRFromRightCt1.SetNextCondition(LogicConnector.AND,tExtBRFromRightCt2);

        GuardMapping grdtExtBRFromRight= new GuardMapping();
        grdtExtBRFromRight.condition = tExtBRFromRightCt1;
        grdtExtBRFromRight.Activations.add(new Activation(tExtBRFromRight, "PI1Right", TransitionOperation.PopElementWithTargetToQueue, "pBR1Right"));
        tExtBRFromRight.GuardMappingList.add(grdtExtBRFromRight);

        tExtBRFromRight.Delay=1;
        pn.Transitions.add(tExtBRFromRight);
*/

        PetriTransition tExtBRFrommRight = new PetriTransition(pn);
        tExtBRFrommRight.TransitionName = "tExtBRFrommRight";
        tExtBRFrommRight.InputPlaceName.add("pBRExtFromRight");
        tExtBRFrommRight.InputPlaceName.add("PI1Right");

        Condition tExtBRFrommRightCt1= new Condition(tExtBRFrommRight, "PI1Right", TransitionCondition.HaveCarForMe);
        Condition tExtBRFrommRightCt2 = new Condition(tExtBRFrommRight, "pBRExtFromRight", TransitionCondition.CanAddCars);

        tExtBRFrommRightCt1.SetNextCondition(LogicConnector.AND, tExtBRFrommRightCt2);

        GuardMapping grdExtBRFrommRight= new GuardMapping();
        grdExtBRFrommRight.condition = tExtBRFrommRightCt1;
        grdExtBRFrommRight.Activations.add(new Activation(tExtBRFrommRight, "PI1Right", TransitionOperation.PopElementWithTargetToQueue, "pBRExtFromRight"));
        tExtBRFrommRight.GuardMappingList.add(grdExtBRFrommRight);

        tExtBRFrommRight.Delay=1;
        pn.Transitions.add(tExtBRFrommRight);

        //Br

        PetriTransition tBRWRightEnd2 = new PetriTransition(pn);
        tBRWRightEnd2.TransitionName = "tBRWRightEnd2";
        tBRWRightEnd2.InputPlaceName.add("pBRExtFromRight");

        Condition tBRWRightEnd2Ct1= new Condition(tBRWRightEnd2, "pBRExtFromRight", TransitionCondition.HaveCar);

        GuardMapping grdBRWRightEnd2= new GuardMapping();
        grdBRWRightEnd2.condition=tBRWRightEnd2Ct1;
        grdBRWRightEnd2.Activations.add(new Activation(tBRWRightEnd2,"pBRExtFromRight",TransitionOperation.PopElementWithoutTarget,"pBR2Right"));
        tBRWRightEnd2.GuardMappingList.add(grdBRWRightEnd2);

        tBRWRightEnd2.Delay=1;
        pn.Transitions.add(tBRWRightEnd2);


        //--- t1BRW Bulevadrul Revolutiei 1989 spre W
        PetriTransition t1BRWRight = new PetriTransition(pn);
        t1BRWRight.TransitionName = "t1BRWRight";
        t1BRWRight.InputPlaceName.add("pBREnter1Right");
        t1BRWRight.InputPlaceName.add("pBREnter2Right");

        Condition T1BRRightWCt1= new Condition(t1BRWRight, "pBREnter1Right", TransitionCondition.NotNull);
        Condition T1BRRightWCt2 = new Condition(t1BRWRight, "pBREnter2Right", TransitionCondition.CanAddCars);
        T1BRRightWCt1.SetNextCondition(LogicConnector.AND, T1BRRightWCt2);

        GuardMapping grdT1RightBRW = new GuardMapping();
        grdT1RightBRW.condition = T1BRRightWCt1;
        grdT1RightBRW.Activations.add(new Activation(t1BRWRight, "pBREnter1Right", TransitionOperation.AddElement, "pBREnter2Right"));
        t1BRWRight.GuardMappingList.add(grdT1RightBRW);

        t1BRWRight.Delay = 1;
        pn.Transitions.add(t1BRWRight);

        //--- t2- SEMAPHORE with Pedestrian Input Bulevadrul Revolutiei 1989 spre W
        PetriTransition t2BRWRight = new PetriTransition(pn);
        t2BRWRight.TransitionName = "t2BRWRight";
        t2BRWRight.InputPlaceName.add("pBREnter2Right");
        t2BRWRight.InputPlaceName.add("SemBrEnterRight");


        Condition T2BRWRightCt1 = new Condition(t2BRWRight, "SemBrEnterRight", TransitionCondition.Equal,"green");
        Condition T2BRWRightCt2 = new Condition(t2BRWRight, "pBREnter2Right", TransitionCondition.HaveCar);
        T2BRWRightCt1.SetNextCondition(LogicConnector.AND, T2BRWRightCt2);

        GuardMapping grdT2BRWRight = new GuardMapping();
        grdT2BRWRight.condition = T2BRWRightCt1;
        grdT2BRWRight.Activations.add(new Activation(t2BRWRight, "pBREnter2Right", TransitionOperation.PopElementWithoutTarget, "pBREnter3Right"));
        grdT2BRWRight.Activations.add(new Activation(t2BRWRight, "SemBrEnterRight", TransitionOperation.Move, "SemBrEnterRight"));

        t2BRWRight.GuardMappingList.add(grdT2BRWRight);

        Condition grdT2BRWRightPrioCt1 =new Condition(t2BRWRight, "pBREnter2Right", TransitionCondition.HavePriorityCar);
        GuardMapping grdT2BRWRightPrio = new GuardMapping();
        grdT2BRWRightPrio.condition = grdT2BRWRightPrioCt1;
        grdT2BRWRightPrio.Activations.add(new Activation(t2BRWRight, "pBREnter2Right", TransitionOperation.PopElementWithoutTarget, "pBREnter3Right"));
        t2BRWRight.GuardMappingList.add(grdT2BRWRightPrio);

        t2BRWRight.Delay = 5;
        pn.Transitions.add(t2BRWRight);

        //----PI1 Intersection entering Transition with Bulevardul Revolutiei 1989
        PetriTransition t3BRWRight = new PetriTransition(pn);
        t3BRWRight.TransitionName = "t3BRWRight";
        t3BRWRight.InputPlaceName.add("pBREnter3Right");
        t3BRWRight.InputPlaceName.add("PI1Right");

        Condition T3BRWRightCt1 = new Condition(t3BRWRight, "pBREnter3Right", TransitionCondition.NotNull);
        Condition T3BRWRightCt2 = new Condition(t3BRWRight, "PI1Right", TransitionCondition.CanAddCars);
        T3BRWRightCt1.SetNextCondition(LogicConnector.AND, T3BRWRightCt2);

        GuardMapping grdT3BRWRight = new GuardMapping();
        grdT3BRWRight.condition = T3BRWRightCt1;
        grdT3BRWRight.Activations.add(new Activation(t3BRWRight, "pBREnter3Right", TransitionOperation.AddElement, "PI1Right"));
        t3BRWRight.GuardMappingList.add(grdT3BRWRight);

        t3BRWRight.Delay = 1;
        pn.Transitions.add(t3BRWRight);

        // BR North with Tram Line intersection
        PetriTransition tBRNTLRight = new PetriTransition(pn);
        tBRNTLRight.TransitionName = "tBRNTLRight";
        tBRNTLRight.InputPlaceName.add("PI1Right");
        tBRNTLRight.InputPlaceName.add("PI2Right");

        Condition tBRNTLRightCt3= new Condition(tBRNTLRight, "PI1Right", TransitionCondition.HaveCarForMe);
        Condition tBRNTLRightCt4 = new Condition(tBRNTLRight, "PI2Right", TransitionCondition.CanAddCars);

        Condition tBRNTLRightCt1= new Condition(tBRNTLRight, "PI2Right", TransitionCondition.HaveCarForMe);
        Condition tBRNTLRightCt2 = new Condition(tBRNTLRight, "PI1Right", TransitionCondition.CanAddCars);
        tBRNTLRightCt3.SetNextCondition(LogicConnector.AND, tBRNTLRightCt4);
        tBRNTLRightCt1.SetNextCondition(LogicConnector.AND, tBRNTLRightCt2);


        GuardMapping grdTBRNTLRight= new GuardMapping();
        grdTBRNTLRight.condition = tBRNTLRightCt1;
        grdTBRNTLRight.Activations.add(new Activation(tBRNTLRight, "PI2Right", TransitionOperation.PopElementWithTargetToQueue, "PI1Right"));
        tBRNTLRight.GuardMappingList.add(grdTBRNTLRight);

        GuardMapping grdTBRNTLRight2= new GuardMapping();
        grdTBRNTLRight2.condition = tBRNTLRightCt3;
        grdTBRNTLRight2.Activations.add(new Activation(tBRNTLRight, "PI1Right", TransitionOperation.PopElementWithTargetToQueue, "PI2Right"));
        tBRNTLRight.GuardMappingList.add(grdTBRNTLRight2);

        tBRNTLRight.Delay=2;
        pn.Transitions.add(tBRNTLRight);

        //Tram line Exit transition
        PetriTransition tTramLineExitRight = new PetriTransition(pn);
        tTramLineExitRight.TransitionName = "tTramLineExitRight";
        tTramLineExitRight.InputPlaceName.add("TramExitRight");
        tTramLineExitRight.InputPlaceName.add("PI2Right");

        Condition tTramLineExitRightCt1= new Condition(tTramLineExitRight, "PI2Right", TransitionCondition.HaveCarForMe);
        Condition tTramLineExitRightCt2 = new Condition(tTramLineExitRight, "TramExitRight", TransitionCondition.CanAddCars);
        Condition tTramLineExitRightCt3 = new Condition(tTramLineExitRight, "PI2Right", TransitionCondition.HaveBus);
        tTramLineExitRightCt2.SetNextCondition(LogicConnector.AND,tTramLineExitRightCt3);
        tTramLineExitRightCt1.SetNextCondition(LogicConnector.AND, tTramLineExitRightCt2);

        GuardMapping grdTramLineExitRight= new GuardMapping();
        grdTramLineExitRight.condition = tTramLineExitRightCt1;
        grdTramLineExitRight.Activations.add(new Activation(tTramLineExitRight, "PI2Right", TransitionOperation.PopElementWithTargetToQueue, "TramExitRight"));
        tTramLineExitRight.GuardMappingList.add(grdTramLineExitRight);

        tTramLineExitRight.Delay=1;
        pn.Transitions.add(tTramLineExitRight);
        //

        PetriTransition tTramLineExitRight2 = new PetriTransition(pn);
        tTramLineExitRight2.TransitionName = "tTramLineExitRight2";
        tTramLineExitRight2.InputPlaceName.add("TramExitRight");

        Condition tTramLineExitRight2Ct1= new Condition(tTramLineExitRight2, "TramExitRight", TransitionCondition.HaveCar);

        GuardMapping grdTramLineExitRight2= new GuardMapping();
        grdTramLineExitRight2.condition=tTramLineExitRight2Ct1;
        grdTramLineExitRight2.Activations.add(new Activation(tTramLineExitRight2,"TramExitRight",TransitionOperation.PopElementWithoutTarget,"TramEnter1"));
        tTramLineExitRight2.GuardMappingList.add(grdTramLineExitRight2);

        tTramLineExitRight2.Delay=1;
        pn.Transitions.add(tTramLineExitRight2);

        //--- Tram station through intersection
        PetriTransition tTramLineCenterRight = new PetriTransition(pn);
        tTramLineCenterRight.TransitionName = "tTramLineCenterRight";
        tTramLineCenterRight.InputPlaceName.add("TramEnter1Right");
        tTramLineCenterRight.InputPlaceName.add("TramEnter2Right");

        Condition TTramLineCenterRightCt1= new Condition(tTramLineCenterRight, "TramEnter1Right", TransitionCondition.NotNull);
        Condition TTramLineCenterRightCt2 = new Condition(tTramLineCenterRight, "TramEnter2Right", TransitionCondition.CanAddCars);
        TTramLineCenterRightCt1.SetNextCondition(LogicConnector.AND, TTramLineCenterRightCt2);

        GuardMapping grdTTramLineCenterRight = new GuardMapping();
        grdTTramLineCenterRight.condition = TTramLineCenterRightCt1;
        grdTTramLineCenterRight.Activations.add(new Activation(tTramLineCenterRight, "TramEnter1Right", TransitionOperation.AddElement, "TramEnter2Right"));
        tTramLineCenterRight.GuardMappingList.add(grdTTramLineCenterRight);

        tTramLineCenterRight.Delay = 1;
        pn.Transitions.add(tTramLineCenterRight);

        //--- t2- SEMAPHORE with Pedestrian Input Bulevadrul Revolutiei 1989 spre W
        PetriTransition tSemTramLineRight = new PetriTransition(pn);
        tSemTramLineRight.TransitionName = "tSemTramLineRight";
        tSemTramLineRight.InputPlaceName.add("TramEnter2Right");
        tSemTramLineRight.InputPlaceName.add("TramPedSem");
        tSemTramLineRight.InputPlaceName.add("UserReqTramRight");
        tSemTramLineRight.InputPlaceName.add("PedTramEnterRight");

        Condition TSemTramLineRightCt1 = new Condition(tSemTramLineRight, "TramPedSem", TransitionCondition.Equal,"green");
        Condition TSemTramLineRightCt2 = new Condition(tSemTramLineRight, "TramEnter2Right", TransitionCondition.HaveCar);
        TSemTramLineRightCt1.SetNextCondition(LogicConnector.AND, TSemTramLineRightCt2);

        Condition TSemTramLineRightPrioCt1 =new Condition(tSemTramLineRight, "TramEnter2Right", TransitionCondition.HavePriorityCar);
        GuardMapping grdTSemTramLineRightPrio = new GuardMapping();
        grdTSemTramLineRightPrio.condition = TSemTramLineRightPrioCt1;
        grdTSemTramLineRightPrio.Activations.add(new Activation(tSemTramLineRight, "TramEnter2Right", TransitionOperation.PopElementWithoutTarget, "TramEnter3Right"));
        tSemTramLineRight.GuardMappingList.add(grdTSemTramLineRightPrio);

        GuardMapping grdTSemTramLineRight = new GuardMapping();
        grdTSemTramLineRight.condition = TSemTramLineRightCt1;
        grdTSemTramLineRight.Activations.add(new Activation(tSemTramLineRight, "TramEnter2Right", TransitionOperation.PopElementWithoutTarget, "TramEnter3Right"));
        grdTSemTramLineRight.Activations.add(new Activation(tSemTramLineRight, "PedTramEnterRight", TransitionOperation.Move, "PedTramEnterRight"));

        tSemTramLineRight.GuardMappingList.add(grdTSemTramLineRight);

        Condition TSemTramLineRightCt3 = new Condition(tSemTramLineRight, "UserReqTramRight", TransitionCondition.NotNull);

        GuardMapping grd2TSemTramLineRight= new GuardMapping();
        grd2TSemTramLineRight.condition = TSemTramLineRightCt3;

        grd2TSemTramLineRight.Activations.add(new Activation(tSemTramLineRight, "TramPedSem", TransitionOperation.Move, "TramPedSem"));
        grd2TSemTramLineRight.Activations.add(new Activation(tSemTramLineRight, "PedTramEnterRight", TransitionOperation.Move, "PedTramEnterRight"));
        grd2TSemTramLineRight.Activations.add(new Activation(tSemTramLineRight, "UserReqTramRight", TransitionOperation.SendOverNetwork, "OPReqTramRight"));

        tSemTramLineRight.GuardMappingList.add(grd2TSemTramLineRight);

        tSemTramLineRight.Delay = 1;
        pn.Transitions.add(tSemTramLineRight);

        //----PI1 Intersection entering Transition with Bulevardul Revolutiei 1989
        PetriTransition tTramStationExitRight= new PetriTransition(pn);
        tTramStationExitRight.TransitionName = "tTramStationExitRight";
        tTramStationExitRight.InputPlaceName.add("TramEnter3Right");
        tTramStationExitRight.InputPlaceName.add("PI2Right");

        Condition tTramStationExitRightCt1 = new Condition(tTramStationExitRight, "TramEnter3Right", TransitionCondition.NotNull);
        Condition tTramStationExitRightCt2 = new Condition(tTramStationExitRight, "PI2Right", TransitionCondition.CanAddCars);
        tTramStationExitRightCt1.SetNextCondition(LogicConnector.AND, tTramStationExitRightCt2);

        GuardMapping grdtTramStationExitRight = new GuardMapping();
        grdtTramStationExitRight.condition = tTramStationExitRightCt1;
        grdtTramStationExitRight.Activations.add(new Activation(tTramStationExitRight, "TramEnter3Right", TransitionOperation.AddElement, "PI2Right"));
        tTramStationExitRight.GuardMappingList.add(grdtTramStationExitRight);

        tTramStationExitRight.Delay = 1;
        pn.Transitions.add(tTramStationExitRight);



        //Bulevardul Revolutiei -> Est Right most inersecrion

        PetriTransition t1BREsatRight = new PetriTransition(pn);
        t1BREsatRight.TransitionName = "t1BREastRight";
        t1BREsatRight.InputPlaceName.add("pBREastRightEn1");
        t1BREsatRight.InputPlaceName.add("pBREastRightEn2");

        Condition T1BREsatRightCt1 = new Condition(t1BREsatRight, "pBREastRightEn1", TransitionCondition.NotNull);
        Condition T1BREsatRightCt2 = new Condition(t1BREsatRight, "pBREastRightEn2", TransitionCondition.CanAddCars);
        T1BREsatRightCt1.SetNextCondition(LogicConnector.AND, T1BREsatRightCt2);

        GuardMapping grdT1BREsatRight = new GuardMapping();
        grdT1BREsatRight.condition = T1BREsatRightCt1;
        grdT1BREsatRight.Activations.add(new Activation(t1BREsatRight, "pBREastRightEn1", TransitionOperation.AddElement, "pBREastRightEn2"));
        t1BREsatRight.GuardMappingList.add(grdT1BREsatRight);

        t1BREsatRight.Delay = 1;
        pn.Transitions.add(t1BREsatRight);

        // Bulevardul Revolutiei -> est Car queue right most intersection

        PetriTransition t2BREastRight = new PetriTransition(pn);
        t2BREastRight.TransitionName = "t2BREastRight";
        t2BREastRight.InputPlaceName.add("pBREastRightEn2");
        t2BREastRight.InputPlaceName.add("SemBREastRightEn");

        Condition T2BREastRightCt1 = new Condition(t2BREastRight, "SemBREastRightEn", TransitionCondition.Equal, "green");
        Condition T2BREastRightCt2 = new Condition(t2BREastRight, "pBREastRightEn2", TransitionCondition.HaveCar);
        //T2BREastRightCt1.SetNextCondition(LogicConnector.AND, T2BREastRightCt2);

        GuardMapping grdT2BREsatRight = new GuardMapping();
        grdT2BREsatRight.condition = T2BREastRightCt2;
        grdT2BREsatRight.Activations.add(new Activation(t2BREastRight, "pBREastRightEn2", TransitionOperation.PopElementWithoutTarget, "pBREastRightEn3"));
        grdT2BREsatRight.Activations.add(new Activation(t2BREastRight, "SemBREastRightEn", TransitionOperation.Move, "SemBREastRightEn"));
        t2BREastRight.GuardMappingList.add(grdT2BREsatRight);

        Condition t2BREastRightPrioCt1 =new Condition(tSemTramLineRight, "pBREastRightEn2", TransitionCondition.HavePriorityCar);
        GuardMapping grdt2BREastRightPrio = new GuardMapping();
        grdt2BREastRightPrio.condition = t2BREastRightPrioCt1;
        grdt2BREastRightPrio.Activations.add(new Activation(tSemTramLineRight, "pBREastRightEn2", TransitionOperation.PopElementWithoutTarget, "pBREastRightEn3"));
        tSemTramLineRight.GuardMappingList.add(grdt2BREastRightPrio);


        t2BREastRight.Delay = 5;
        pn.Transitions.add(t2BREastRight);


        // p3 to intersection
        PetriTransition t3BREastRight = new PetriTransition(pn);
        t3BREastRight.TransitionName = "t3BREastRight";
        t3BREastRight.InputPlaceName.add("pBREastRightEn3");
        t3BREastRight.InputPlaceName.add("PI3Right");

        Condition T3BREastRightCt1 = new Condition(t3BREastRight, "pBREastRightEn3", TransitionCondition.NotNull);
        Condition T3BREastRightCt2 = new Condition(t3BREastRight, "PI3Right", TransitionCondition.CanAddCars);
        T3BREastRightCt1.SetNextCondition(LogicConnector.AND, T3BREastRightCt2);

        GuardMapping grdT3BREastRight = new GuardMapping();
        grdT3BREastRight.condition = T3BREastRightCt1;
        grdT3BREastRight.Activations.add(new Activation(t3BREastRight, "pBREastRightEn3", TransitionOperation.AddElement, "PI3Right"));
        t3BREastRight.GuardMappingList.add(grdT3BREastRight);

        t3BREastRight.Delay = 1;
        pn.Transitions.add(t3BREastRight);

        // PI3 Right to PI2Right
        PetriTransition tBRSTLRight = new PetriTransition(pn);
        tBRSTLRight.TransitionName = "tBRSTLRight";
        tBRSTLRight.InputPlaceName.add("PI2Right");
        tBRSTLRight.InputPlaceName.add("PI3Right");

        Condition tBRSTLRightCt3= new Condition(tBRSTLRight, "PI2Right", TransitionCondition.HaveCarForMe);
        Condition tBRSTLRightCt4 = new Condition(tBRSTLRight, "PI3Right", TransitionCondition.CanAddCars);

        Condition tBRSTLRightCt1= new Condition(tBRSTLRight, "PI3Right", TransitionCondition.HaveCarForMe);
        Condition tBRSTLRightCt2 = new Condition(tBRSTLRight, "PI2Right", TransitionCondition.CanAddCars);
        tBRSTLRightCt3.SetNextCondition(LogicConnector.AND, tBRSTLRightCt4);
        tBRSTLRightCt1.SetNextCondition(LogicConnector.AND, tBRSTLRightCt2);


        GuardMapping grdTBRSTLRight= new GuardMapping();
        grdTBRSTLRight.condition = tBRSTLRightCt1;
        grdTBRSTLRight.Activations.add(new Activation(tBRSTLRight, "PI3Right", TransitionOperation.PopElementWithTargetToQueue, "PI2Right"));
        tBRSTLRight.GuardMappingList.add(grdTBRSTLRight);

        GuardMapping grdTBRSTLRight2= new GuardMapping();
        grdTBRSTLRight2.condition = tBRSTLRightCt3;
        grdTBRSTLRight2.Activations.add(new Activation(tBRSTLRight, "PI2Right", TransitionOperation.PopElementWithTargetToQueue, "PI3Right"));
        tBRSTLRight.GuardMappingList.add(grdTBRSTLRight2);

        tBRSTLRight.Delay=2;
        pn.Transitions.add(tBRSTLRight);


        // PI3 Right to BR End pBREastRightEx1
        PetriTransition t1BRERightEnd = new PetriTransition(pn);
        t1BRERightEnd.TransitionName = "t1BRERightEnd";
        t1BRERightEnd.InputPlaceName.add("PI3Right");
        t1BRERightEnd.InputPlaceName.add("pBREastRightEx1");

        Condition tBRERightEndCt1= new Condition(t1BRERightEnd, "PI3Right", TransitionCondition.HaveCarForMe);
        Condition tBRERightEndCt2 = new Condition(t1BRERightEnd, "pBREastRightEx1", TransitionCondition.CanAddCars);
        tBRERightEndCt1.SetNextCondition(LogicConnector.AND,tBRERightEndCt2);

        GuardMapping grdtBRERightEnd= new GuardMapping();
        grdtBRERightEnd.condition = tBRERightEndCt1;
        grdtBRERightEnd.Activations.add(new Activation(t1BRERightEnd, "PI3Right", TransitionOperation.PopElementWithTargetToQueue, "pBREastRightEx1"));
        t1BRERightEnd.GuardMappingList.add(grdtBRERightEnd);
        t1BRERightEnd.Delay=1;
        pn.Transitions.add(t1BRERightEnd);
        //

        PetriTransition tBRERightEnd2 = new PetriTransition(pn);
        tBRERightEnd2.TransitionName = "tBRERightEnd2";
        tBRERightEnd2.InputPlaceName.add("pBREastRightEx1");

        Condition tBRERightEnd2Ct1= new Condition(tBRERightEnd2, "pBREastRightEx1", TransitionCondition.HaveCar);

        GuardMapping grdtBRERightEnd2= new GuardMapping();
        grdtBRERightEnd2.condition=tBRERightEnd2Ct1;
        grdtBRERightEnd2.Activations.add(new Activation(tBRERightEnd2,"pBREastRightEx1",TransitionOperation.PopElementWithoutTarget,"pBREastRightEx2"));
        tBRERightEnd2.GuardMappingList.add(grdtBRERightEnd2);

        tBRERightEnd2.Delay=1;
        pn.Transitions.add(tBRERightEnd2);

        // BR Crosswalk North

        DataCar InterEnter = new DataCar();
        InterEnter.SetName("InterEnter");
        pn.PlaceList.add(InterEnter);

        DataCarQueue BrCrossWalk = new DataCarQueue();
        BrCrossWalk.Value.Size = 1;
        BrCrossWalk.SetName("BrCrossWalk");
        pn.PlaceList.add(BrCrossWalk);

        DataString PedSCrossWalk = new DataString();
        PedSCrossWalk.SetName("PedSCrossWalk");
        pn.PlaceList.add(PedSCrossWalk);

        DataString usrReqCrossWalk = new DataString();
        usrReqCrossWalk.SetName("UsrReqCrossWalk");
        pn.PlaceList.add(usrReqCrossWalk);

        DataString CarSCrossWalk = new DataString();
        CarSCrossWalk.SetName("CarSCrossWalk");
        pn.PlaceList.add(CarSCrossWalk);

        DataTransfer OPReqCrossWalk = new DataTransfer();
        OPReqCrossWalk.SetName("OPReqCrossWalk");
        OPReqCrossWalk.Value = new TransferOperation("localhost", "1085" , "UserReq");
        pn.PlaceList.add(OPReqCrossWalk);

        // Crosswalk Transition
        PetriTransition tCrossWalkFRTM = new PetriTransition(pn);
        tCrossWalkFRTM.TransitionName = "tCrossWalkFRTM";
        tCrossWalkFRTM.InputPlaceName.add("BrCrossWalk");
        tCrossWalkFRTM.InputPlaceName.add("CarSCrossWalk");
        tCrossWalkFRTM.InputPlaceName.add("UsrReqCrossWalk");
        tCrossWalkFRTM.InputPlaceName.add("PedSCrossWalk");

        Condition TCrossWalkFRTMCt1 = new Condition(tCrossWalkFRTM, "CarSCrossWalk", TransitionCondition.Equal,"green");
        Condition TCrossWalkFRTMCt2 = new Condition(tCrossWalkFRTM, "BrCrossWalk", TransitionCondition.HaveCar);
        TCrossWalkFRTMCt1.SetNextCondition(LogicConnector.AND, TCrossWalkFRTMCt2);

        Condition TCrossWalkFRTMPrioCt1 =new Condition(tCrossWalkFRTM, "BrCrossWalk", TransitionCondition.HavePriorityCar);
        GuardMapping grdTCrossWalkFRTMPrio = new GuardMapping();
        grdTCrossWalkFRTMPrio.condition = TCrossWalkFRTMPrioCt1;
        grdTCrossWalkFRTMPrio.Activations.add(new Activation(tCrossWalkFRTM, "BrCrossWalk", TransitionOperation.PopElementWithoutTarget, "InterEnter"));
        tCrossWalkFRTM.GuardMappingList.add(grdTCrossWalkFRTMPrio);

        GuardMapping grdTCrossWalkFRTM = new GuardMapping();
        grdTCrossWalkFRTM.condition = TCrossWalkFRTMCt1;
        grdTCrossWalkFRTM.Activations.add(new Activation(tCrossWalkFRTM, "BrCrossWalk", TransitionOperation.PopElementWithoutTarget, "InterEnter"));
        grdTCrossWalkFRTM.Activations.add(new Activation(tCrossWalkFRTM, "PedSCrossWalk", TransitionOperation.Move, "PedSCrossWalk"));

        tCrossWalkFRTM.GuardMappingList.add(grdTCrossWalkFRTM);

        Condition TCrossWalkFRTMCt3 = new Condition(tCrossWalkFRTM, "UsrReqCrossWalk", TransitionCondition.NotNull);

        GuardMapping grd2TCrossWalkFRTM= new GuardMapping();
        grd2TCrossWalkFRTM.condition = TCrossWalkFRTMCt3;

        grd2TCrossWalkFRTM.Activations.add(new Activation(tCrossWalkFRTM, "CarSCrossWalk", TransitionOperation.Move, "CarSCrossWalk"));
        grd2TCrossWalkFRTM.Activations.add(new Activation(tCrossWalkFRTM, "PedSCrossWalk", TransitionOperation.Move, "PedSCrossWalk"));
        grd2TCrossWalkFRTM.Activations.add(new Activation(tCrossWalkFRTM, "UsrReqCrossWalk", TransitionOperation.SendOverNetwork, "OPReqCrossWalk"));

        tCrossWalkFRTM.GuardMappingList.add(grd2TCrossWalkFRTM);

        tCrossWalkFRTM.Delay = 1;
        pn.Transitions.add(tCrossWalkFRTM);

        // T from Right intersection to Crosswalk
        PetriTransition tCrosswalkEnter = new PetriTransition(pn);
        tCrosswalkEnter.TransitionName = "tCrosswalkEnter";
        tCrosswalkEnter.InputPlaceName.add("pBR2Right");
        tCrosswalkEnter.InputPlaceName.add("BrCrossWalk");

        Condition TCrosswalkEnterCt1= new Condition(tCrosswalkEnter, "pBR2Right", TransitionCondition.NotNull);
        Condition TCrosswalkEnterCt2 = new Condition(tCrosswalkEnter, "BrCrossWalk", TransitionCondition.CanAddCars);
        TCrosswalkEnterCt1.SetNextCondition(LogicConnector.AND, TCrosswalkEnterCt2);

        GuardMapping grdTCrosswalkEnter = new GuardMapping();
        grdTCrosswalkEnter.condition = TCrosswalkEnterCt1;
        grdTCrosswalkEnter.Activations.add(new Activation(tCrosswalkEnter, "pBR2Right", TransitionOperation.AddElement, "BrCrossWalk"));
        tCrosswalkEnter.GuardMappingList.add(grdTCrosswalkEnter);

        tCrosswalkEnter.Delay = 1;
        pn.Transitions.add(tCrosswalkEnter);

        // Priority Lane Middle

        DataCarQueue BrSmallInter = new DataCarQueue();
        BrSmallInter.Value.Size = 2;
        BrSmallInter.SetName("BrSmallInter");
        pn.PlaceList.add(BrSmallInter);


        // Inter Enter with inter

        PetriTransition tSmallInterEnter = new PetriTransition(pn);
        tSmallInterEnter.TransitionName = "tSmallInterEnter";
        tSmallInterEnter.InputPlaceName.add("InterEnter");

        Condition tSmallInterEnterCt1= new Condition(tSmallInterEnter, "InterEnter", TransitionCondition.NotNull);

        GuardMapping grdTSmallInterEnter= new GuardMapping();
        grdTSmallInterEnter.condition = tSmallInterEnterCt1;
        grdTSmallInterEnter.Activations.add(new Activation(tSmallInterEnter, "InterEnter", TransitionOperation.Move, "pBREnter1"));
        tSmallInterEnter.GuardMappingList.add(grdTSmallInterEnter);


        tSmallInterEnter.Delay=2;
        pn.Transitions.add(tSmallInterEnter);

        //LEFT INTERSECTION
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        DataCar pca1 = new DataCar();
        pca1.SetName("pca_o1");
        pn.PlaceList.add(pca1);

        DataCar pca2 = new DataCar();
        pca2.SetName("pca_o2");
        pn.PlaceList.add(pca2);

        DataCar pca3 = new DataCar();
        pca3.SetName("pca_o3");
        pn.PlaceList.add(pca3);

        DataCar pca4 = new DataCar();
        pca4.SetName("pca_o4");
        pn.PlaceList.add(pca4);

        DataCar pca12 = new DataCar();
        pca12.SetName("pca_o5");
        pn.PlaceList.add(pca12);

        DataCar pca5 = new DataCar();
        pca5.SetName("pca_in1");
        pn.PlaceList.add(pca5);

        DataCar pca6 = new DataCar();
        pca6.SetName("pca_in2");
        pn.PlaceList.add(pca6);

        DataCar pca7 = new DataCar();
        pca7.SetName("pca_in3");
        pn.PlaceList.add(pca7);

        DataCar pca13 = new DataCar();
        pca13.SetName("pca_in4");
        pn.PlaceList.add(pca13);

        DataCar pca14 = new DataCar();
        pca14.SetName("pca_in5");
        pn.PlaceList.add(pca14);

        DataCarQueue pca8 = new DataCarQueue();
        pca8.Value.Size = 3;
        pca8.SetName("pca_q1");
        pn.PlaceList.add(pca8);

        DataCarQueue pca9 = new DataCarQueue();
        pca9.Value.Size = 3;
        pca9.SetName("pca_q2");
        pn.PlaceList.add(pca9);

        DataCarQueue pca10 = new DataCarQueue();
        pca10.Value.Size = 3;
        pca10.SetName("pca_q3");
        pn.PlaceList.add(pca10);

        DataCarQueue pca11 = new DataCarQueue();
        pca11.Value.Size = 3;
        pca11.SetName("pca_q4");
        pn.PlaceList.add(pca11);

        DataCarQueue pca15 = new DataCarQueue();
        pca15.Value.Size = 3;
        pca15.SetName("pca_q5");
        pn.PlaceList.add(pca15);

        DataCarQueue pca16 = new DataCarQueue();
        pca16.Value.Size = 3;
        pca16.SetName("pca_i1");
        pn.PlaceList.add(pca16);

        DataCarQueue pca17 = new DataCarQueue();
        pca17.Value.Size = 3;
        pca17.SetName("pca_i2");
        pn.PlaceList.add(pca17);

        DataCarQueue pca18 = new DataCarQueue();
        pca18.Value.Size = 3;
        pca18.SetName("pca_i3");
        pn.PlaceList.add(pca18);

        DataCarQueue pca19 = new DataCarQueue();
        pca19.Value.Size = 3;
        pca19.SetName("pca_i4");
        pn.PlaceList.add(pca19);

        DataCar pca20 = new DataCar();
        pca20.SetName("pca_sin11");
        pn.PlaceList.add(pca20);

        DataCar pca70 = new DataCar();
        pca70.SetName("pca_sin12");
        pn.PlaceList.add(pca70);

        DataCar pca21 = new DataCar();
        pca21.SetName("pca_sin2");
        pn.PlaceList.add(pca21);

        DataCar pca22 = new DataCar();
        pca22.SetName("pca_sin3");
        pn.PlaceList.add(pca22);

        DataCar pca23 = new DataCar();
        pca23.SetName("pca_sin4");
        pn.PlaceList.add(pca23);

        DataCarQueue pca24 = new DataCarQueue();
        pca24.Value.Size = 3;
        pca24.SetName("pca_sq1");
        pn.PlaceList.add(pca24);

        DataCarQueue pca25 = new DataCarQueue();
        pca25.Value.Size = 3;
        pca25.SetName("pca_sq2");
        pn.PlaceList.add(pca25);

        DataCarQueue pca26 = new DataCarQueue();
        pca26.Value.Size = 3;
        pca26.SetName("pca_sq3");
        pn.PlaceList.add(pca26);

        DataCarQueue pca27 = new DataCarQueue();
        pca27.Value.Size = 3;
        pca27.SetName("pca_sq4");
        pn.PlaceList.add(pca27);

        DataCarQueue pca28 = new DataCarQueue();
        pca28.Value.Size = 3;
        pca28.SetName("pca_sq5");
        pn.PlaceList.add(pca28);

        DataString pca29 = new DataString();
        pca29.SetName("pca_ptl1");
        pn.PlaceList.add(pca29);

        DataString pca30 = new DataString();
        pca30.SetName("pca_ptl2");
        pn.PlaceList.add(pca30);

        DataString pca31 = new DataString();
        pca31.SetName("pca_ptl3");
        pn.PlaceList.add(pca31);

        DataString pca32 = new DataString();
        pca32.SetName("pca_ptl4");
        pn.PlaceList.add(pca32);

        DataString pca33 = new DataString();
        pca33.SetName("pca_ptl5");
        pn.PlaceList.add(pca33);

        DataString pca34 = new DataString();
        pca34.SetName("pca_pptl1");
        pn.PlaceList.add(pca34);

        DataString pca35 = new DataString();
        pca35.SetName("pca_pptl2");
        pn.PlaceList.add(pca35);

        DataString pca36 = new DataString();
        pca36.SetName("pca_pptl3");
        pn.PlaceList.add(pca36);

        DataString pca37 = new DataString();
        pca37.SetName("pca_pptl4");
        pn.PlaceList.add(pca37);

        DataString pca38 = new DataString();
        pca38.SetName("pca_pptl5");
        pn.PlaceList.add(pca38);

        DataString pca39 = new DataString();
        pca39.SetName("pca_userreq1");
        pn.PlaceList.add(pca39);

        DataString pca40 = new DataString();
        pca40.SetName("pca_userreq2");
        pn.PlaceList.add(pca40);

        DataString pca41 = new DataString();
        pca41.SetName("pca_userreq3");
        pn.PlaceList.add(pca41);

        DataString pca42 = new DataString();
        pca42.SetName("pca_userreq4");
        pn.PlaceList.add(pca42);

        DataString pca43 = new DataString();
        pca43.SetName("pca_userreq5");
        pn.PlaceList.add(pca43);

        DataTransfer pca44 = new DataTransfer();
        pca44.Value = new TransferOperation("localhost", "1081", "usereq1");
        pca44.SetName("pca_op1");
        pn.PlaceList.add(pca44);

        DataTransfer pca45 = new DataTransfer();
        pca45.Value = new TransferOperation("localhost", "1081", "usereq2");
        pca45.SetName("pca_op2");
        pn.PlaceList.add(pca45);

        DataTransfer pca46 = new DataTransfer();
        pca46.Value = new TransferOperation("localhost", "1081", "usereq3");
        pca46.SetName("pca_op3");
        pn.PlaceList.add(pca46);

        DataTransfer pca47 = new DataTransfer();
        pca47.Value = new TransferOperation("localhost", "1081", "usereq4");
        pca47.SetName("pca_op4");
        pn.PlaceList.add(pca47);

        DataTransfer pca48 = new DataTransfer();
        pca48.Value = new TransferOperation("localhost", "1081", "usereq5");
        pca48.SetName("pca_op5");
        pn.PlaceList.add(pca48);

        DataString pca49 = new DataString();
        pca49.SetName("green");
        pca49.SetValue("green");
        pca49.Printable = false;
        pn.ConstantPlaceList.add(pca49);

        DataString pca50 = new DataString();
        pca50.SetName("full");
        pca50.SetValue("full");
        pn.ConstantPlaceList.add(pca50);


        // extra places
        DataCar pca51 = new DataCar();
        pca51.SetName("pca_in6");
        pn.PlaceList.add(pca51);

        DataCarQueue pca52 = new DataCarQueue();
        pca52.SetName("pca_i5");
        pca52.Value.Size = 3;
        pn.PlaceList.add(pca52);


        // placeuri pt intersectia lui Felix

        DataCar pca54 = new DataCar();
        pca54.SetName("pca_in7");
        pn.PlaceList.add(pca54);

        DataCar pca55 = new DataCar();
        pca55.SetName("pca_in8");
        pn.PlaceList.add(pca55);

        DataCar pca56 = new DataCar();
        pca56.SetName("pca_o7");
        pn.PlaceList.add(pca56);

        DataCar pca57 = new DataCar();
        pca57.SetName("pca_o8");
        pn.PlaceList.add(pca57);

        DataCarQueue pca59 = new DataCarQueue();
        pca59.Value.Size = 3;
        pca59.SetName("pca_q6");
        pn.PlaceList.add(pca59);

        DataCarQueue pca60 = new DataCarQueue();
        pca60.Value.Size = 3;
        pca60.SetName("pca_q7");
        pn.PlaceList.add(pca60);


        DataCarQueue pca61 = new DataCarQueue();
        pca61.SetName("pca_i6");
        pca61.Value.Size = 3;
        pn.PlaceList.add(pca61);

        DataString pca62 = new DataString();
        pca62.SetName("pca_pptl6");
        pn.PlaceList.add(pca62);

        DataString pca63 = new DataString();
        pca63.SetName("pca_userreq6");
        pn.PlaceList.add(pca63);

        DataString pca64 = new DataString();
        pca64.SetName("pca_pptl7");
        pn.PlaceList.add(pca64);

        DataString pca65 = new DataString();
        pca65.SetName("pca_userreq7");
        pn.PlaceList.add(pca65);

        DataTransfer pca66 = new DataTransfer();
        pca66.Value = new TransferOperation("localhost", "1081", "pca_userreq6");
        pca66.SetName("pca_op6");
        pn.PlaceList.add(pca66);

        DataTransfer pca67 = new DataTransfer();
        pca67.Value = new TransferOperation("localhost", "1081", "pca_userreq7");
        pca67.SetName("pca_op7");
        pn.PlaceList.add(pca67);

        DataString pca68 = new DataString();
        pca68.SetName("pca_ptl6");
        pn.PlaceList.add(pca68);

        DataString pca69 = new DataString();
        pca69.SetName("pca_ptl7");
        pn.PlaceList.add(pca69);

        // output channels for controller for dinamic delay

        DataTransfer po1 = new DataTransfer();
        po1.SetName("OP1");
        po1.Value = new TransferOperation("localhost", "1081" , "in1");
        pn.PlaceList.add(po1);

        DataTransfer po2 = new DataTransfer();
        po2.SetName("OP2");
        po2.Value = new TransferOperation("localhost", "1081" , "in2");
        pn.PlaceList.add(po2);

        DataTransfer po3 = new DataTransfer();
        po3.SetName("OP3");
        po3.Value = new TransferOperation("localhost", "1081" , "in3");
        pn.PlaceList.add(po3);

        DataTransfer po4 = new DataTransfer();
        po4.SetName("OP4");
        po4.Value = new TransferOperation("localhost", "1081" , "in4");
        pn.PlaceList.add(po4);

        //Transitions
        //Output transition for pca_o1
        PetriTransition tca1 = new PetriTransition(pn);
        tca1.TransitionName = "tca_o1";
        tca1.InputPlaceName.add("pca_q1");

        Condition tca1ct1 = new Condition(tca1, "pca_q1", TransitionCondition.HaveCar);

        GuardMapping grdtca1 = new GuardMapping();
        grdtca1.condition = tca1ct1;
        grdtca1.Activations.add(new Activation(tca1, "pca_q1", TransitionOperation.PopElementWithoutTarget, "pca_o1"));
        tca1.GuardMappingList.add(grdtca1);

        tca1.Delay = 1;
        pn.Transitions.add(tca1);

        //Output transition for pca_o2
        PetriTransition tca2 = new PetriTransition(pn);
        tca2.TransitionName = "tca_o2";
        tca2.InputPlaceName.add("pca_q2");

        Condition tca2ct1 = new Condition(tca2, "pca_q2", TransitionCondition.HaveCar);

        GuardMapping grdtca2 = new GuardMapping();
        grdtca2.condition = tca2ct1;
        grdtca2.Activations.add(new Activation(tca2, "pca_q2", TransitionOperation.PopElementWithoutTarget, "pca_o2"));
        tca2.GuardMappingList.add(grdtca2);

        tca2.Delay = 1;
        pn.Transitions.add(tca2);

        //Output transition for pca_o3
        PetriTransition tca3 = new PetriTransition(pn);
        tca3.TransitionName = "tca_o3";
        tca3.InputPlaceName.add("pca_q3");

        Condition tca3ct1 = new Condition(tca1, "pca_q3", TransitionCondition.HaveCar);

        GuardMapping grdtca3 = new GuardMapping();
        grdtca3.condition = tca3ct1;
        grdtca3.Activations.add(new Activation(tca3, "pca_q3", TransitionOperation.PopElementWithoutTarget, "pca_o3"));
        tca3.GuardMappingList.add(grdtca3);

        tca3.Delay = 1;
        pn.Transitions.add(tca3);

        //Output transition for pca_o4
        PetriTransition tca4 = new PetriTransition(pn);
        tca4.TransitionName = "tca_o4";
        tca4.InputPlaceName.add("pca_q4");

        Condition tca4ct1 = new Condition(tca4, "pca_q4", TransitionCondition.HaveCar);

        GuardMapping grdtca4 = new GuardMapping();
        grdtca4.condition = tca4ct1;
        grdtca4.Activations.add(new Activation(tca4, "pca_q4", TransitionOperation.PopElementWithoutTarget, "pca_o4"));
        tca4.GuardMappingList.add(grdtca4);

        tca4.Delay = 1;
        pn.Transitions.add(tca4);

        //Output transition for pca_o5
        PetriTransition tca5 = new PetriTransition(pn);
        tca5.TransitionName = "tca_o5";
        tca5.InputPlaceName.add("pca_q5");

        Condition tca5ct1 = new Condition(tca5, "pca_q5", TransitionCondition.HaveCar);

        GuardMapping grdtca5 = new GuardMapping();
        grdtca5.condition = tca5ct1;
        grdtca5.Activations.add(new Activation(tca5, "pca_q5", TransitionOperation.PopElementWithoutTarget, "pca_o5"));
        tca5.GuardMappingList.add(grdtca5);

        tca5.Delay = 1;
        pn.Transitions.add(tca5);

        //Output transition for pca_q1
        PetriTransition tca6 = new PetriTransition(pn);
        tca6.TransitionName = "tca_q1";
        tca6.InputPlaceName.add("pca_q1");
        tca6.InputPlaceName.add("pca_i1");

        Condition tca6ct1 = new Condition(tca6, "pca_i1", TransitionCondition.HaveCarForMe);
        Condition tca6ct2 = new Condition(tca6, "pca_q1", TransitionCondition.CanAddCars);

        tca6ct1.SetNextCondition(LogicConnector.AND, tca6ct2);

        GuardMapping grdtca6 = new GuardMapping();
        grdtca6.condition = tca6ct1;
        grdtca6.Activations.add(new Activation(tca6, "pca_i1", TransitionOperation.PopElementWithoutTargetToQueue, "pca_q1"));
        tca6.GuardMappingList.add(grdtca6);

        tca6.Delay = 1;
        pn.Transitions.add(tca6);

        //Output transition for pca_q2
        PetriTransition tca7 = new PetriTransition(pn);
        tca7.TransitionName = "tca_q2";
        tca7.InputPlaceName.add("pca_q2");
        tca7.InputPlaceName.add("pca_i1");

        Condition tca7ct1 = new Condition(tca7, "pca_i1", TransitionCondition.HaveCarForMe);
        Condition tca7ct2 = new Condition(tca7, "pca_q2", TransitionCondition.CanAddCars);

        tca7ct1.SetNextCondition(LogicConnector.AND, tca7ct2);

        GuardMapping grdtca7 = new GuardMapping();
        grdtca7.condition = tca7ct1;
        grdtca7.Activations.add(new Activation(tca7, "pca_i1", TransitionOperation.PopElementWithoutTargetToQueue, "pca_q2"));
        tca7.GuardMappingList.add(grdtca7);

        tca7.Delay = 1;
        pn.Transitions.add(tca7);

        //Output transition for pca_q3
        PetriTransition tca8 = new PetriTransition(pn);
        tca8.TransitionName = "tca_q3";
        tca8.InputPlaceName.add("pca_q3");
        tca8.InputPlaceName.add("pca_i2");

        Condition tca8ct1 = new Condition(tca8, "pca_i2", TransitionCondition.HaveCarForMe);
        Condition tca8ct2 = new Condition(tca8, "pca_q3", TransitionCondition.CanAddCars);
        Condition tca8ct3 = new Condition(tca8, "pca_i2", TransitionCondition.IsBus);

        tca8ct1.SetNextCondition(LogicConnector.AND, tca8ct2);
        tca8ct1.SetNextCondition(LogicConnector.AND, tca8ct3);

        GuardMapping grdtca8 = new GuardMapping();
        grdtca8.condition = tca8ct1;
        grdtca8.Activations.add(new Activation(tca8, "pca_i2", TransitionOperation.PopElementWithoutTargetToQueue, "pca_q3"));
        tca8.GuardMappingList.add(grdtca8);

        tca8.Delay = 1;
        pn.Transitions.add(tca8);

        //Output transition for pca_q4
        PetriTransition tca9 = new PetriTransition(pn);
        tca9.TransitionName = "tca_q4";
        tca9.InputPlaceName.add("pca_q4");
        tca9.InputPlaceName.add("pca_i4");

        Condition tca9ct1 = new Condition(tca9, "pca_i4", TransitionCondition.HaveCarForMe);
        Condition tca9ct2 = new Condition(tca9, "pca_q4", TransitionCondition.CanAddCars);

        tca9ct1.SetNextCondition(LogicConnector.AND, tca9ct2);

        GuardMapping grdtca9 = new GuardMapping();
        grdtca9.condition = tca9ct1;
        grdtca9.Activations.add(new Activation(tca9, "pca_i4", TransitionOperation.PopElementWithoutTargetToQueue, "pca_q4"));
        tca9.GuardMappingList.add(grdtca9);

        tca9.Delay = 1;
        pn.Transitions.add(tca9);

        //Output transition for pca_q5
        PetriTransition tca10 = new PetriTransition(pn);
        tca10.TransitionName = "tca_q5";
        tca10.InputPlaceName.add("pca_q5");
        tca10.InputPlaceName.add("pca_i3");

        Condition tca10ct1 = new Condition(tca10, "pca_i3", TransitionCondition.HaveCarForMe);
        Condition tca10ct2 = new Condition(tca10, "pca_q5", TransitionCondition.CanAddCars);

        tca10ct1.SetNextCondition(LogicConnector.AND, tca10ct2);

        GuardMapping grdtca10 = new GuardMapping();
        grdtca10.condition = tca10ct1;
        grdtca10.Activations.add(new Activation(tca10, "pca_i3", TransitionOperation.PopElementWithoutTargetToQueue, "pca_q5"));
        tca10.GuardMappingList.add(grdtca10);

        tca10.Delay = 1;
        pn.Transitions.add(tca10);

        //Input transition for pca_in1
        PetriTransition tca11 = new PetriTransition(pn);
        tca11.TransitionName = "tca_in1";
        tca11.InputPlaceName.add("pca_in1");

        Condition tca11ct1 = new Condition(tca11, "pca_in1", TransitionCondition.NotNull);
        Condition tca11ct2 = new Condition(tca11, "pca_i3", TransitionCondition.CanAddCars);

        tca11ct1.SetNextCondition(LogicConnector.AND, tca11ct2);

        GuardMapping grdtca11 = new GuardMapping();
        grdtca11.condition = tca11ct1;
        grdtca11.Activations.add(new Activation(tca11, "pca_in1", TransitionOperation.AddElement, "pca_i3"));
        tca11.GuardMappingList.add(grdtca11);

        tca11.Delay = 1;
        pn.Transitions.add(tca11);

        //Input transition for pca_in2
        PetriTransition tca12 = new PetriTransition(pn);
        tca12.TransitionName = "tca_in2";
        tca12.InputPlaceName.add("pca_in2");

        Condition tca12ct1 = new Condition(tca12, "pca_in2", TransitionCondition.NotNull);
        Condition tca12ct2 = new Condition(tca12, "pca_i4", TransitionCondition.CanAddCars);

        tca12ct1.SetNextCondition(LogicConnector.AND, tca12ct2);

        GuardMapping grdtca12 = new GuardMapping();
        grdtca12.condition = tca12ct1;
        grdtca12.Activations.add(new Activation(tca12, "pca_in2", TransitionOperation.AddElement, "pca_i4"));
        tca12.GuardMappingList.add(grdtca12);

        tca12.Delay = 1;
        pn.Transitions.add(tca12);

        //Input transition for pca_in3
        PetriTransition tca13 = new PetriTransition(pn);
        tca13.TransitionName = "tca_in3";
        tca13.InputPlaceName.add("pca_in3");

        Condition tca13ct1 = new Condition(tca13, "pca_in3", TransitionCondition.NotNull);
        Condition tca13ct2 = new Condition(tca13, "pca_i3", TransitionCondition.CanAddCars);

        tca13ct1.SetNextCondition(LogicConnector.AND, tca13ct2);

        GuardMapping grdtca13 = new GuardMapping();
        grdtca13.condition = tca13ct1;
        grdtca13.Activations.add(new Activation(tca13, "pca_in3", TransitionOperation.AddElement, "pca_i3"));
        tca13.GuardMappingList.add(grdtca13);

        tca13.Delay = 1;
        pn.Transitions.add(tca13);

        //Input transition for pca_in4
        PetriTransition tca14 = new PetriTransition(pn);
        tca14.TransitionName = "tca_in4";
        tca14.InputPlaceName.add("pca_in4");

        Condition tca14ct1 = new Condition(tca14, "pca_in4", TransitionCondition.NotNull);
        Condition tca14ct2 = new Condition(tca14, "pca_i2", TransitionCondition.CanAddCars);

        tca14ct1.SetNextCondition(LogicConnector.AND, tca14ct2);

        GuardMapping grdtca14 = new GuardMapping();
        grdtca14.condition = tca14ct1;
        grdtca14.Activations.add(new Activation(tca14, "pca_in4", TransitionOperation.AddElement, "pca_i2"));
        tca14.GuardMappingList.add(grdtca14);
        tca14.Delay = 1;
        pn.Transitions.add(tca14);

        //Input transition for pca_in5
        PetriTransition tca15 = new PetriTransition(pn);
        tca15.TransitionName = "tca_in5";
        tca15.InputPlaceName.add("pca_in5");

        Condition tca15ct1 = new Condition(tca15, "pca_in5", TransitionCondition.NotNull);
        Condition tca15ct2 = new Condition(tca15, "pca_i1", TransitionCondition.CanAddCars);

        tca15ct1.SetNextCondition(LogicConnector.AND, tca15ct2);

        GuardMapping grdtca15 = new GuardMapping();
        grdtca15.condition = tca15ct1;
        grdtca15.Activations.add(new Activation(tca15, "pca_in5", TransitionOperation.AddElement, "pca_i1"));
        tca15.GuardMappingList.add(grdtca15);

        tca15.Delay = 1;
        pn.Transitions.add(tca15);

        //Transition between pi1 and pi2
        PetriTransition tca16 = new PetriTransition(pn);
        tca16.TransitionName = "tca_i1i2";
        tca16.InputPlaceName.add("pca_i1");
        tca16.InputPlaceName.add("pca_i2");

        Condition tca16ct1 = new Condition(tca16, "pca_i1", TransitionCondition.HaveCarForMe);
        Condition tca16ct2 = new Condition(tca16, "pca_i1", TransitionCondition.CanAddCars);
        Condition tca16ct3 = new Condition(tca16, "pca_i2", TransitionCondition.HaveCarForMe);
        Condition tca16ct4 = new Condition(tca16, "pca_i2", TransitionCondition.CanAddCars);
        Condition tca16ct5 = new Condition(tca16, "pca_in4", TransitionCondition.IsNull);
        Condition tca16ct6 = new Condition(tca16, "pca_i1", TransitionCondition.HavePriorityCar);
        Condition tca16ct7 = new Condition(tca16, "pca_i1", TransitionCondition.CanAddCars);

        tca16ct1.SetNextCondition(LogicConnector.AND, tca16ct4);
        tca16ct1.SetNextCondition(LogicConnector.AND, tca16ct5);
        tca16ct2.SetNextCondition(LogicConnector.AND, tca16ct3);
        tca16ct6.SetNextCondition(LogicConnector.AND, tca16ct7);

        GuardMapping grdtca16 = new GuardMapping();
        grdtca16.condition = tca16ct1;
        grdtca16.Activations.add(new Activation(tca16, "pca_i1", TransitionOperation.PopElementWithoutTargetToQueue, "pca_i2"));
        tca16.GuardMappingList.add(grdtca16);

        GuardMapping grd2tca16 = new GuardMapping();
        grd2tca16.condition = tca16ct2;
        grd2tca16.Activations.add(new Activation(tca16, "pca_i2", TransitionOperation.PopElementWithoutTargetToQueue, "pca_i1"));
        tca16.GuardMappingList.add(grd2tca16);

        GuardMapping grd3tca16 = new GuardMapping();
        grd3tca16.condition = tca16ct6;
        grd3tca16.Activations.add(new Activation(tca16, "pca_i1", TransitionOperation.PopElementWithoutTargetToQueue, "pca_i2"));
        tca16.GuardMappingList.add(grd3tca16);

        tca16.Delay = 1;
        pn.Transitions.add(tca16);

        //Transition between pi2 and pi3
        PetriTransition tca17 = new PetriTransition(pn);
        tca17.TransitionName = "tca_i2i3";
        tca17.InputPlaceName.add("pca_i2");
        tca17.InputPlaceName.add("pca_i3");

        Condition tca17ct1 = new Condition(tca17, "pca_i2", TransitionCondition.HaveCarForMe);
        Condition tca17ct2 = new Condition(tca17, "pca_i2", TransitionCondition.CanAddCars);
        Condition tca17ct3 = new Condition(tca17, "pca_i3", TransitionCondition.HaveCarForMe);
        Condition tca17ct4 = new Condition(tca17, "pca_i3", TransitionCondition.CanAddCars);
        Condition tca17ct5 = new Condition(tca17, "pca_in4", TransitionCondition.IsNull);
        Condition tca17ct6 = new Condition(tca16, "pca_i3", TransitionCondition.HavePriorityCar);
        Condition tca17ct7 = new Condition(tca16, "pca_i2", TransitionCondition.CanAddCars);

        tca17ct3.SetNextCondition(LogicConnector.AND, tca17ct2);
        tca17ct3.SetNextCondition(LogicConnector.AND, tca17ct5);
        tca17ct1.SetNextCondition(LogicConnector.AND, tca17ct4);
        tca17ct6.SetNextCondition(LogicConnector.AND, tca17ct7);

        GuardMapping grd2tca17 = new GuardMapping();
        grd2tca17.condition = tca17ct3;
        grd2tca17.Activations.add(new Activation(tca17, "pca_i3", TransitionOperation.PopElementWithoutTargetToQueue, "pca_i2"));
        tca17.GuardMappingList.add(grd2tca17);

        GuardMapping grdtca17 = new GuardMapping();
        grdtca17.condition = tca17ct1;
        grdtca17.Activations.add(new Activation(tca17, "pca_i2", TransitionOperation.PopElementWithoutTargetToQueue, "pca_i3"));
        tca17.GuardMappingList.add(grdtca17);

        GuardMapping grd3tca17 = new GuardMapping();
        grd3tca17.condition = tca17ct6;
        grd3tca17.Activations.add(new Activation(tca17, "pca_i3", TransitionOperation.PopElementWithoutTargetToQueue, "pca_i2"));
        tca17.GuardMappingList.add(grd3tca17);

        tca17.Delay = 1;
        pn.Transitions.add(tca17);

        //Transition between pi3 and pi4
        PetriTransition tca18 = new PetriTransition(pn);
        tca18.TransitionName = "tca_i3i4";
        tca18.InputPlaceName.add("pca_i3");
        tca18.InputPlaceName.add("pca_i4");

        Condition tca18ct1 = new Condition(tca18, "pca_i3", TransitionCondition.HaveCarForMe);
        Condition tca18ct2 = new Condition(tca18, "pca_i3", TransitionCondition.CanAddCars);
        Condition tca18ct3 = new Condition(tca18, "pca_i4", TransitionCondition.HaveCarForMe);
        Condition tca18ct4 = new Condition(tca18, "pca_i4", TransitionCondition.CanAddCars);

        tca18ct1.SetNextCondition(LogicConnector.AND, tca18ct4);
        tca18ct2.SetNextCondition(LogicConnector.AND, tca18ct3);

        GuardMapping grdtca18 = new GuardMapping();
        grdtca18.condition = tca18ct1;
        grdtca18.Activations.add(new Activation(tca18, "pca_i3", TransitionOperation.PopElementWithoutTargetToQueue, "pca_i4"));
        tca18.GuardMappingList.add(grdtca18);

        GuardMapping grd2tca18 = new GuardMapping();
        grd2tca18.condition = tca18ct2;
        grd2tca18.Activations.add(new Activation(tca18, "pca_i4", TransitionOperation.PopElementWithoutTargetToQueue, "pca_i3"));
        tca18.GuardMappingList.add(grd2tca18);

        tca18.Delay = 1;
        pn.Transitions.add(tca18);

        //Transition for semaphore 1
        PetriTransition tca19 = new PetriTransition(pn);
        tca19.TransitionName = "tca_sq1";
        tca19.InputPlaceName.add("pca_sin11");
        tca19.InputPlaceName.add("pca_sq1");

        Condition tca19ct1 = new Condition(tca19, "pca_sin11", TransitionCondition.NotNull);
        Condition tca19ct2 = new Condition(tca19, "pca_sq1", TransitionCondition.CanAddCars);

        tca19ct1.SetNextCondition(LogicConnector.AND, tca19ct2);

        GuardMapping grdtca19 = new GuardMapping();
        grdtca19.condition = tca19ct1;
        grdtca19.Activations.add(new Activation(tca19, "pca_sin11", TransitionOperation.AddElement, "pca_sq1"));
        tca19.GuardMappingList.add(grdtca19);

        tca19.Delay = 1;
        pn.Transitions.add(tca19);

        //Transition for semaphore 2
        PetriTransition tca20 = new PetriTransition(pn);
        tca20.TransitionName = "tca_sq2";
        tca20.InputPlaceName.add("pca_sin12");
        tca20.InputPlaceName.add("pca_sq2");

        Condition tca20ct1 = new Condition(tca20, "pca_sin12", TransitionCondition.NotNull);
        Condition tca20ct2 = new Condition(tca20, "pca_sq2", TransitionCondition.CanAddCars);

        tca20ct1.SetNextCondition(LogicConnector.AND, tca20ct2);

        GuardMapping grdtca20 = new GuardMapping();
        grdtca20.condition = tca20ct1;
        grdtca20.Activations.add(new Activation(tca20, "pca_sin12", TransitionOperation.AddElement, "pca_sq2"));
        tca20.GuardMappingList.add(grdtca20);

        tca20.Delay = 1;
        pn.Transitions.add(tca20);

        //Transition for semaphore 3
        PetriTransition tca21 = new PetriTransition(pn);
        tca21.TransitionName = "tca_sq3";
        tca21.InputPlaceName.add("pca_sin2");
        tca21.InputPlaceName.add("pca_sq3");

        Condition tca21ct1 = new Condition(tca21, "pca_sin2", TransitionCondition.NotNull);
        Condition tca21ct2 = new Condition(tca21, "pca_sq3", TransitionCondition.CanAddCars);

        tca21ct1.SetNextCondition(LogicConnector.AND, tca21ct2);

        GuardMapping grdtca21 = new GuardMapping();
        grdtca21.condition = tca21ct1;
        grdtca21.Activations.add(new Activation(tca21, "pca_sin2", TransitionOperation.AddElement, "pca_sq3"));
        tca21.GuardMappingList.add(grdtca21);

        tca21.Delay = 1;
        pn.Transitions.add(tca21);

        //Transition for semaphore 4
        PetriTransition tca22 = new PetriTransition(pn);
        tca22.TransitionName = "tca_sq4";
        tca22.InputPlaceName.add("pca_sin3");
        tca22.InputPlaceName.add("pca_sq4");

        Condition tca22ct1 = new Condition(tca22, "pca_sin3", TransitionCondition.NotNull);
        Condition tca22ct2 = new Condition(tca22, "pca_sq4", TransitionCondition.CanAddCars);

        tca19ct1.SetNextCondition(LogicConnector.AND, tca22ct2);

        GuardMapping grdtca22 = new GuardMapping();
        grdtca22.condition = tca22ct1;
        grdtca22.Activations.add(new Activation(tca22, "pca_sin3", TransitionOperation.AddElement, "pca_sq4"));
        tca22.GuardMappingList.add(grdtca22);

        tca22.Delay = 1;
        pn.Transitions.add(tca22);

        //Transition for semaphore 5
        PetriTransition tca23 = new PetriTransition(pn);
        tca23.TransitionName = "tca_sq5";
        tca23.InputPlaceName.add("pca_sin4");
        tca23.InputPlaceName.add("pca_sq5");

        Condition tca23ct1 = new Condition(tca23, "pca_sin4", TransitionCondition.NotNull);
        Condition tca23ct2 = new Condition(tca23, "pca_sq5", TransitionCondition.CanAddCars);

        tca23ct1.SetNextCondition(LogicConnector.AND, tca23ct2);

        GuardMapping grdtca23 = new GuardMapping();
        grdtca23.condition = tca23ct1;
        grdtca23.Activations.add(new Activation(tca23, "pca_sin4", TransitionOperation.AddElement, "pca_sq5"));
        tca23.GuardMappingList.add(grdtca23);

        tca23.Delay = 1;
        pn.Transitions.add(tca23);

        //BigTransition for semaphore 1
        PetriTransition tca24 = new PetriTransition(pn);
        tca24.TransitionName = "tca_sem1";
        tca24.InputPlaceName.add("pca_sq1");
        tca24.InputPlaceName.add("pca_userreq1");
        tca24.InputPlaceName.add("pca_ptl1");
        tca24.InputPlaceName.add("pca_pptl1");

        Condition tca24ct1 = new Condition(tca24, "pca_ptl1", TransitionCondition.Equal, "green");
        Condition tca24ct2 = new Condition(tca24, "pca_sq1", TransitionCondition.HaveCar);

        tca24ct1.SetNextCondition(LogicConnector.AND, tca24ct2);

        GuardMapping grdtca24 = new GuardMapping();
        grdtca24.condition = tca24ct1;
        grdtca24.Activations.add(new Activation(tca24, "pca_sq1", TransitionOperation.PopElementWithoutTarget, "pca_in1"));
        grdtca24.Activations.add(new Activation(tca24, "pca_ptl1", TransitionOperation.Move, "pca_ptl1"));
        grdtca24.Activations.add(new Activation(tca24, "pca_pptl1", TransitionOperation.Move, "pca_pptl1"));
        tca24.GuardMappingList.add(grdtca24);

        Condition tca24tc3 = new Condition(tca24, "pca_userreq1", TransitionCondition.NotNull);

        GuardMapping grd2tca24 = new GuardMapping();
        grd2tca24.condition = tca24tc3;
        grd2tca24.Activations.add(new Activation(tca24, "pca_userreq1", TransitionOperation.SendOverNetwork, "pca_op1"));
        grd2tca24.Activations.add(new Activation(tca24, "pca_ptl1", TransitionOperation.Move, "pca_ptl1"));
        grd2tca24.Activations.add(new Activation(tca24, "pca_pptl1", TransitionOperation.Move, "pca_pptl1"));
        tca24.GuardMappingList.add(grd2tca24);

        Condition tca24ct3 = new Condition(tca24, "pca_sq1", TransitionCondition.HavePriorityCar);

        GuardMapping grd3tca24 = new GuardMapping();
        grd3tca24.condition = tca24ct3;
        grd3tca24.Activations.add(new Activation(tca24, "pca_sq1", TransitionOperation.PopElementWithoutTarget, "pca_in1"));
        grd3tca24.Activations.add(new Activation(tca24, "pca_ptl1", TransitionOperation.Move, "pca_ptl1"));
        tca24.GuardMappingList.add(grd3tca24);

        tca24.Delay = 1;
        pn.Transitions.add(tca24);

        //BigTransition for semaphore 2
        PetriTransition tca25 = new PetriTransition(pn);
        tca25.TransitionName = "tca_sem2";
        tca25.InputPlaceName.add("pca_sq2");
        tca25.InputPlaceName.add("pca_userreq2");
        tca25.InputPlaceName.add("pca_ptl2");
        tca25.InputPlaceName.add("pca_pptl2");

        Condition tca25ct1 = new Condition(tca25, "pca_ptl2", TransitionCondition.Equal, "green");
        Condition tca25ct2 = new Condition(tca25, "pca_sq2", TransitionCondition.HaveCar);

        tca25ct1.SetNextCondition(LogicConnector.AND, tca25ct2);

        GuardMapping grdtca25 = new GuardMapping();
        grdtca25.condition = tca25ct1;
        grdtca25.Activations.add(new Activation(tca25, "pca_sq2", TransitionOperation.PopElementWithoutTarget, "pca_in2"));
        grdtca25.Activations.add(new Activation(tca25, "pca_ptl2", TransitionOperation.Move, "pca_ptl2"));
        grdtca25.Activations.add(new Activation(tca25, "pca_pptl2", TransitionOperation.Move, "pca_pptl2"));
        tca25.GuardMappingList.add(grdtca25);

        Condition tca25tc3 = new Condition(tca25, "pca_userreq2", TransitionCondition.NotNull);

        GuardMapping grd2tca25 = new GuardMapping();
        grd2tca25.condition = tca25tc3;
        grd2tca25.Activations.add(new Activation(tca25, "pca_userreq2", TransitionOperation.SendOverNetwork, "pca_op2"));
        grd2tca25.Activations.add(new Activation(tca25, "pca_ptl2", TransitionOperation.Move, "pca_ptl2"));
        grd2tca25.Activations.add(new Activation(tca25, "pca_pptl2", TransitionOperation.Move, "pca_pptl2"));
        tca25.GuardMappingList.add(grd2tca25);

        Condition tca25ct4 = new Condition(tca25, "pca_sq2", TransitionCondition.HavePriorityCar);

        GuardMapping grd3tca25 = new GuardMapping();
        grd3tca25.condition = tca25ct4;
        grd3tca25.Activations.add(new Activation(tca25, "pca_sq2", TransitionOperation.PopElementWithoutTarget, "pca_in2"));
        grd3tca25.Activations.add(new Activation(tca25, "pca_ptl2", TransitionOperation.Move, "pca_ptl2"));
        tca25.GuardMappingList.add(grd3tca25);

        tca25.Delay = 1;
        pn.Transitions.add(tca25);

        //BigTransition for semaphore 3
        PetriTransition tca26 = new PetriTransition(pn);
        tca26.TransitionName = "tca_sem3";
        tca26.InputPlaceName.add("pca_sq3");
        tca26.InputPlaceName.add("pca_userreq3");
        tca26.InputPlaceName.add("pca_ptl3");
        tca26.InputPlaceName.add("pca_pptl3");

        Condition tca26ct1 = new Condition(tca26, "pca_ptl3", TransitionCondition.Equal, "green");
        Condition tca26ct2 = new Condition(tca26, "pca_sq3", TransitionCondition.HaveCar);

        tca26ct1.SetNextCondition(LogicConnector.AND, tca26ct2);

        GuardMapping grdtca26 = new GuardMapping();
        grdtca26.condition = tca26ct1;
        grdtca26.Activations.add(new Activation(tca26, "pca_sq3", TransitionOperation.PopElementWithoutTarget, "pca_in3"));
        grdtca26.Activations.add(new Activation(tca26, "pca_ptl3", TransitionOperation.Move, "pca_ptl3"));
        grdtca26.Activations.add(new Activation(tca26, "pca_pptl3", TransitionOperation.Move, "pca_pptl3"));
        tca26.GuardMappingList.add(grdtca26);

        Condition tca26tc3 = new Condition(tca26, "pca_userreq3", TransitionCondition.NotNull);

        GuardMapping grd2tca26 = new GuardMapping();
        grd2tca26.condition = tca26tc3;
        grd2tca26.Activations.add(new Activation(tca26, "pca_userreq3", TransitionOperation.SendOverNetwork, "pca_op3"));
        grd2tca26.Activations.add(new Activation(tca26, "pca_ptl3", TransitionOperation.Move, "pca_ptl3"));
        grd2tca26.Activations.add(new Activation(tca26, "pca_pptl3", TransitionOperation.Move, "pca_pptl3"));
        tca26.GuardMappingList.add(grd2tca26);

        Condition tca26ct4 = new Condition(tca26, "pca_sq3", TransitionCondition.HavePriorityCar);

        GuardMapping grd3tca26 = new GuardMapping();
        grd3tca26.condition = tca26ct4;
        grd3tca26.Activations.add(new Activation(tca26, "pca_sq3", TransitionOperation.PopElementWithoutTarget, "pca_in3"));
        grd3tca26.Activations.add(new Activation(tca26, "pca_ptl3", TransitionOperation.Move, "pca_ptl3"));
        tca25.GuardMappingList.add(grd3tca26);

        tca26.Delay = 1;
        pn.Transitions.add(tca26);

        //BigTransition for semaphore 4
        PetriTransition tca27 = new PetriTransition(pn);
        tca27.TransitionName = "tca_sem4";
        tca27.InputPlaceName.add("pca_sq4");
        tca27.InputPlaceName.add("pca_userreq4");
        tca27.InputPlaceName.add("pca_ptl4");
        tca27.InputPlaceName.add("pca_pptl4");

        Condition tca27ct1 = new Condition(tca27, "pca_ptl4", TransitionCondition.Equal, "green");
        Condition tca27ct2 = new Condition(tca27, "pca_sq4", TransitionCondition.HaveCar);

        tca27ct1.SetNextCondition(LogicConnector.AND, tca27ct2);

        GuardMapping grdtca27 = new GuardMapping();
        grdtca27.condition = tca27ct1;
        grdtca27.Activations.add(new Activation(tca27, "pca_sq4", TransitionOperation.PopElementWithoutTarget, "pca_in4"));
        grdtca27.Activations.add(new Activation(tca27, "pca_ptl4", TransitionOperation.Move, "pca_ptl4"));
        grdtca27.Activations.add(new Activation(tca27, "pca_pptl4", TransitionOperation.Move, "pca_pptl4"));
        tca27.GuardMappingList.add(grdtca27);

        Condition tca27tc3 = new Condition(tca27, "pca_userreq4", TransitionCondition.NotNull);

        GuardMapping grd2tca27 = new GuardMapping();
        grd2tca27.condition = tca27tc3;
        grd2tca27.Activations.add(new Activation(tca27, "pca_userreq4", TransitionOperation.SendOverNetwork, "pca_op4"));
        grd2tca27.Activations.add(new Activation(tca27, "pca_ptl4", TransitionOperation.Move, "pca_ptl4"));
        grd2tca27.Activations.add(new Activation(tca27, "pca_pptl4", TransitionOperation.Move, "pca_pptl4"));
        tca27.GuardMappingList.add(grd2tca27);

        tca27.Delay = 1;
        pn.Transitions.add(tca27);

        //BigTransition for semaphore 5
        PetriTransition tca28 = new PetriTransition(pn);
        tca28.TransitionName = "tca_sem5";
        tca28.InputPlaceName.add("pca_sq5");
        tca28.InputPlaceName.add("pca_userreq5");
        tca28.InputPlaceName.add("pca_ptl5");
        tca28.InputPlaceName.add("pca_pptl5");

        Condition tca28ct1 = new Condition(tca28, "pca_ptl4", TransitionCondition.Equal, "green");
        Condition tca28ct2 = new Condition(tca28, "pca_sq5", TransitionCondition.HaveCar);

        tca28ct1.SetNextCondition(LogicConnector.AND, tca28ct2);

        GuardMapping grdtca28 = new GuardMapping();
        grdtca28.condition = tca28ct1;
        grdtca28.Activations.add(new Activation(tca28, "pca_sq5", TransitionOperation.PopElementWithoutTarget, "pca_in5"));
        grdtca28.Activations.add(new Activation(tca28, "pca_ptl4", TransitionOperation.Move, "pca_ptl4"));
        grdtca28.Activations.add(new Activation(tca28, "pca_pptl5", TransitionOperation.Move, "pca_pptl5"));
        tca28.GuardMappingList.add(grdtca28);

        Condition tca28tc3 = new Condition(tca28, "pca_userreq5", TransitionCondition.NotNull);

        GuardMapping grd2tca28 = new GuardMapping();
        grd2tca28.condition = tca28tc3;
        grd2tca28.Activations.add(new Activation(tca28, "pca_userreq5", TransitionOperation.SendOverNetwork, "pca_op5"));
        grd2tca28.Activations.add(new Activation(tca28, "pca_ptl4", TransitionOperation.Move, "pca_ptl4"));
        grd2tca28.Activations.add(new Activation(tca28, "pca_pptl5", TransitionOperation.Move, "pca_pptl5"));
        tca28.GuardMappingList.add(grd2tca28);

        Condition tca28ct4 = new Condition(tca28, "pca_sq5", TransitionCondition.HavePriorityCar);

        GuardMapping grd3tca28 = new GuardMapping();
        grd3tca28.condition = tca28ct4;
        grd3tca28.Activations.add(new Activation(tca28, "pca_sq5", TransitionOperation.PopElementWithoutTarget, "pca_in5"));
        grd3tca28.Activations.add(new Activation(tca28, "pca_ptl4", TransitionOperation.Move, "pca_ptl4"));
        tca28.GuardMappingList.add(grd3tca28);

        tca28.Delay = 1;
        pn.Transitions.add(tca28);


        // transitions for extra intersection

        PetriTransition tca29 = new PetriTransition(pn);
        tca29.TransitionName = "tca_in6";
        tca29.InputPlaceName.add("pca_o5");

        Condition tca29ct1 = new Condition(tca29, "pca_o5", TransitionCondition.NotNull);
        Condition tca29ct2 = new Condition(tca29, "pca_i5", TransitionCondition.CanAddCars);

        tca29ct1.SetNextCondition(LogicConnector.AND, tca29ct2);

        GuardMapping grdtca29 = new GuardMapping();
        grdtca29.condition = tca29ct1;
        grdtca29.Activations.add(new Activation(tca29, "pca_o5", TransitionOperation.AddElement, "pca_i5"));
        tca29.GuardMappingList.add(grdtca29);

        tca29.Delay = 1;
        pn.Transitions.add(tca29);


        PetriTransition tca30 = new PetriTransition(pn);
        tca30.TransitionName = "tca_in7";
        tca30.InputPlaceName.add("pca_in6");

        Condition tca30ct1 = new Condition(tca30, "pca_in6", TransitionCondition.NotNull);
        Condition tca30ct2 = new Condition(tca30, "pca_i5", TransitionCondition.CanAddCars);
        Condition tca30ct3 = new Condition(tca30, "pca_o5", TransitionCondition.IsNull);

        tca30ct1.SetNextCondition(LogicConnector.AND, tca30ct2);
        tca30ct1.SetNextCondition(LogicConnector.AND, tca30ct3);

        GuardMapping grdtca30 = new GuardMapping();
        grdtca30.condition = tca30ct1;
        grdtca30.Activations.add(new Activation(tca30, "pca_in6", TransitionOperation.AddElement, "pca_i5"));
        tca30.GuardMappingList.add(grdtca30);

        tca30.Delay = 1;
        pn.Transitions.add(tca30);



        PetriTransition tca31 = new PetriTransition(pn);
        tca31.TransitionName = "tca_o6";
        tca31.InputPlaceName.add("pca_i5");

        Condition tca31ct1 = new Condition(tca31, "pca_i5", TransitionCondition.HaveCarForMe);

        GuardMapping grdtca31 = new GuardMapping();
        grdtca31.condition = tca31ct1;
        grdtca31.Activations.add(new Activation(tca31, "pca_i5", TransitionOperation.PopElementWithoutTarget, "p1EstBRMid"));
        tca31.GuardMappingList.add(grdtca31);

        tca31.Delay = 1;
        pn.Transitions.add(tca31);

        //transitions for intersection after what Felix did




        PetriTransition tca32 = new PetriTransition(pn);
        tca32.TransitionName = "tca_sq6";
        tca32.InputPlaceName.add("pca_in7");
        tca32.InputPlaceName.add("pca_q6");

        Condition tca32ct1 = new Condition(tca32, "pca_in7", TransitionCondition.NotNull);
        Condition tca32ct2 = new Condition(tca32, "pca_q6", TransitionCondition.CanAddCars);

        tca32ct1.SetNextCondition(LogicConnector.AND, tca32ct2);

        GuardMapping grdtca32 = new GuardMapping();
        grdtca32.condition = tca32ct1;
        grdtca32.Activations.add(new Activation(tca32, "pca_in7", TransitionOperation.AddElement, "pca_q6"));
        tca32.GuardMappingList.add(grdtca32);

        tca32.Delay = 1;
        pn.Transitions.add(tca32);




        PetriTransition tca33 = new PetriTransition(pn);
        tca33.TransitionName = "tca_sem6";
        tca33.InputPlaceName.add("pca_q6");
        tca33.InputPlaceName.add("pca_userreq6");
        tca33.InputPlaceName.add("pca_ptl6");
        tca33.InputPlaceName.add("pca_pptl6");

        Condition tca33ct1 = new Condition(tca33, "pca_ptl6", TransitionCondition.Equal, "green");
        Condition tca33ct2 = new Condition(tca33, "pca_q6", TransitionCondition.HaveCar);

        tca33ct1.SetNextCondition(LogicConnector.AND, tca33ct2);

        GuardMapping grdtca33 = new GuardMapping();
        grdtca33.condition = tca33ct1;
        grdtca33.Activations.add(new Activation(tca33, "pca_q6", TransitionOperation.PopElementWithoutTarget, "pca_o7"));
        grdtca33.Activations.add(new Activation(tca33, "pca_ptl6", TransitionOperation.Move, "pca_ptl6"));
        grdtca33.Activations.add(new Activation(tca33, "pca_pptl6", TransitionOperation.Move, "pca_pptl6"));
        tca33.GuardMappingList.add(grdtca33);

        Condition tca33tc3 = new Condition(tca33, "pca_userreq6", TransitionCondition.NotNull);

        GuardMapping grd2tca33 = new GuardMapping();
        grd2tca33.condition = tca33tc3;
        grd2tca33.Activations.add(new Activation(tca33, "pca_userreq6", TransitionOperation.SendOverNetwork, "pca_op6"));
        grd2tca33.Activations.add(new Activation(tca33, "pca_ptl6", TransitionOperation.Move, "pca_ptl6"));
        grd2tca33.Activations.add(new Activation(tca33, "pca_pptl6", TransitionOperation.Move, "pca_pptl6"));
        tca33.GuardMappingList.add(grd2tca33);

        tca33.Delay = 1;
        pn.Transitions.add(tca33);




        PetriTransition tca34 = new PetriTransition(pn);
        tca34.TransitionName = "tca_sq7";
        tca34.InputPlaceName.add("pca_in8");
        tca34.InputPlaceName.add("pca_q7");

        Condition tca34ct1 = new Condition(tca32, "pca_in8", TransitionCondition.NotNull);
        Condition tca34ct2 = new Condition(tca32, "pca_q7", TransitionCondition.CanAddCars);

        tca34ct1.SetNextCondition(LogicConnector.AND, tca34ct2);

        GuardMapping grdtca34 = new GuardMapping();
        grdtca34.condition = tca34ct1;
        grdtca34.Activations.add(new Activation(tca32, "pca_in8", TransitionOperation.AddElement, "pca_q7"));
        tca34.GuardMappingList.add(grdtca34);

        tca34.Delay = 1;
        pn.Transitions.add(tca34);





        PetriTransition tca35 = new PetriTransition(pn);
        tca35.TransitionName = "tca_sem7";
        tca35.InputPlaceName.add("pca_q7");
        tca35.InputPlaceName.add("pca_userreq7");
        tca35.InputPlaceName.add("pca_ptl7");
        tca35.InputPlaceName.add("pca_pptl7");

        Condition tca35ct1 = new Condition(tca35, "pca_ptl7", TransitionCondition.Equal, "green");
        Condition tca35ct2 = new Condition(tca35, "pca_sq7", TransitionCondition.HaveCar);

        tca35ct1.SetNextCondition(LogicConnector.AND, tca35ct2);

        GuardMapping grdtca35 = new GuardMapping();
        grdtca35.condition = tca35ct1;
        grdtca35.Activations.add(new Activation(tca35, "pca_q7", TransitionOperation.PopElementWithoutTarget, "pca_o8"));
        grdtca35.Activations.add(new Activation(tca35, "pca_ptl7", TransitionOperation.Move, "pca_ptl7"));
        grdtca35.Activations.add(new Activation(tca35, "pca_pptl7", TransitionOperation.Move, "pca_pptl7"));
        tca35.GuardMappingList.add(grdtca35);

        Condition tca35tc3 = new Condition(tca35, "pca_userreq7", TransitionCondition.NotNull);

        GuardMapping grd2tca35 = new GuardMapping();
        grd2tca35.condition = tca35tc3;
        grd2tca35.Activations.add(new Activation(tca35, "pca_userreq7", TransitionOperation.SendOverNetwork, "pca_op7"));
        grd2tca35.Activations.add(new Activation(tca35, "pca_ptl7", TransitionOperation.Move, "pca_ptl7"));
        grd2tca35.Activations.add(new Activation(tca35, "pca_pptl7", TransitionOperation.Move, "pca_pptl7"));
        tca35.GuardMappingList.add(grd2tca35);

        tca35.Delay = 1;
        pn.Transitions.add(tca35);




        PetriTransition tca36 = new PetriTransition(pn);
        tca36.TransitionName = "tca_in7";
        tca36.InputPlaceName.add("pca_o7");

        Condition tca36ct1 = new Condition(tca36, "pca_o7", TransitionCondition.NotNull);
        Condition tca36ct2 = new Condition(tca36, "pca_i6", TransitionCondition.CanAddCars);

        tca36ct1.SetNextCondition(LogicConnector.AND, tca36ct2);

        GuardMapping grdtca36 = new GuardMapping();
        grdtca36.condition = tca36ct1;
        grdtca36.Activations.add(new Activation(tca36, "pca_o7", TransitionOperation.AddElement, "pca_i6"));
        tca36.GuardMappingList.add(grdtca36);

        tca36.Delay = 1;
        pn.Transitions.add(tca36);





        PetriTransition tca37 = new PetriTransition(pn);
        tca37.TransitionName = "tca_in8";
        tca37.InputPlaceName.add("pca_o8");

        Condition tca37ct1 = new Condition(tca37, "pca_o8", TransitionCondition.NotNull);
        Condition tca37ct2 = new Condition(tca37, "pca_i6", TransitionCondition.CanAddCars);

        tca37ct1.SetNextCondition(LogicConnector.AND, tca37ct2);

        GuardMapping grdtca37 = new GuardMapping();
        grdtca37.condition = tca37ct1;
        grdtca37.Activations.add(new Activation(tca37, "pca_o8", TransitionOperation.AddElement, "pca_i6"));
        tca37.GuardMappingList.add(grdtca37);

        tca37.Delay = 1;
        pn.Transitions.add(tca37);



        PetriTransition tca38 = new PetriTransition(pn);
        tca38.TransitionName = "tca_o7";
        tca38.InputPlaceName.add("pca_i6");

        Condition tca38ct1 = new Condition(tca38, "pca_i6", TransitionCondition.HaveCarForMe);

        GuardMapping grdtca38 = new GuardMapping();
        grdtca38.condition = tca38ct1;
        grdtca38.Activations.add(new Activation(tca38, "pca_i6", TransitionOperation.PopElementWithoutTarget, "pBREastRightEn1"));
        tca38.GuardMappingList.add(grdtca38);

        tca38.Delay = 1;
        pn.Transitions.add(tca38);


        // transitions for output channels for dynamic delay

        PetriTransition tout1 = new PetriTransition(pn);

        tout1.TransitionName = "tout1";
        tout1.InputPlaceName.add("pca_sin11");
        tout1.InputPlaceName.add("pca_sq1");

        Condition Tout1Ct1 = new Condition(tout1,"pca_sin11", TransitionCondition.NotNull);
        Condition Tout1Ct3 = new Condition(tout1,"pca_sq1",TransitionCondition.CanNotAddCars);
        Tout1Ct1.SetNextCondition(LogicConnector.AND, Tout1Ct3);

        GuardMapping grdoutT1 = new GuardMapping();
        grdoutT1.condition = Tout1Ct1;
        grdoutT1.Activations.add(new Activation(tout1, "FULL", TransitionOperation.SendOverNetwork, "OP1"));

        tout1.GuardMappingList.add(grdoutT1);
        tout1.IsAsync = true;
        tout1.Delay = 0;
        pn.Transitions.add(tout1);



        PetriTransition tout2 = new PetriTransition(pn);

        tout2.TransitionName = "tout2";
        tout2.InputPlaceName.add("pca_sin12");
        tout2.InputPlaceName.add("pca_sq2");

        Condition Tout2Ct1 = new Condition(tout2,"pca_sin12", TransitionCondition.NotNull);
        Condition Tout2Ct3 = new Condition(tout2,"pca_sq2",TransitionCondition.CanNotAddCars);
        Tout2Ct1.SetNextCondition(LogicConnector.AND, Tout2Ct3);

        GuardMapping grdoutT2 = new GuardMapping();
        grdoutT2.condition = Tout2Ct1;
        grdoutT2.Activations.add(new Activation(tout2, "FULL", TransitionOperation.SendOverNetwork, "OP2"));

        tout2.GuardMappingList.add(grdoutT2);
        tout2.IsAsync = true;
        tout2.Delay = 0;
        pn.Transitions.add(tout2);


        PetriTransition tout3 = new PetriTransition(pn);

        tout3.TransitionName = "tout3";
        tout3.InputPlaceName.add("pca_sin2");
        tout3.InputPlaceName.add("pca_sq3");

        Condition Tout3Ct1 = new Condition(tout3,"pca_sin2", TransitionCondition.NotNull);
        Condition Tout3Ct3 = new Condition(tout3,"pca_sq3",TransitionCondition.CanNotAddCars);
        Tout3Ct1.SetNextCondition(LogicConnector.AND, Tout3Ct3);

        GuardMapping grdoutT3 = new GuardMapping();
        grdoutT3.condition = Tout3Ct1;
        grdoutT3.Activations.add(new Activation(tout3, "FULL", TransitionOperation.SendOverNetwork, "OP3"));

        tout3.GuardMappingList.add(grdoutT3);
        tout3.IsAsync = true;
        tout3.Delay = 0;
        pn.Transitions.add(tout3);


        PetriTransition tout4 = new PetriTransition(pn);

        tout4.TransitionName = "tout4";
        tout4.InputPlaceName.add("pca_sin4");
        tout4.InputPlaceName.add("pca_sq5");

        Condition Tout4Ct1 = new Condition(tout4,"pca_sin4", TransitionCondition.NotNull);
        Condition Tout4Ct3 = new Condition(tout4,"pca_sq5",TransitionCondition.CanNotAddCars);
        Tout4Ct1.SetNextCondition(LogicConnector.AND, Tout4Ct3);

        GuardMapping grdoutT4 = new GuardMapping();
        grdoutT4.condition = Tout4Ct1;
        grdoutT4.Activations.add(new Activation(tout4, "FULL", TransitionOperation.SendOverNetwork, "OP4"));

        tout4.GuardMappingList.add(grdoutT4);
        tout4.IsAsync = true;
        tout4.Delay = 0;
        pn.Transitions.add(tout4);

        //MERGE PUTERNIC
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //

        //1
        PetriTransition t_m1 = new PetriTransition(pn);
        t_m1.TransitionName = "t_m1";
        t_m1.InputPlaceName.add("pBR1");

        Condition t_m1ct1 = new Condition(t_m1, "pBR1", TransitionCondition.HaveCar);

        GuardMapping grdt_m1 = new GuardMapping();
        grdt_m1.condition = t_m1ct1;
        grdt_m1.Activations.add(new Activation(t_m1, "pBR1", TransitionOperation.PopElementWithoutTarget, "pca_sin4"));
        t_m1.GuardMappingList.add(grdt_m1);

        t_m1.Delay = 1;
        pn.Transitions.add(t_m1);

        //2
        PetriTransition t_m2 = new PetriTransition(pn);
        t_m2.TransitionName = "t_m2";
        t_m2.InputPlaceName.add("TramExit");

        Condition t_m2ct1 = new Condition(t_m1, "TramExit", TransitionCondition.HaveCar);

        GuardMapping grdt_m2 = new GuardMapping();
        grdt_m2.condition = t_m2ct1;
        grdt_m2.Activations.add(new Activation(t_m2, "TramExit", TransitionOperation.PopElementWithoutTarget, "pca_sin3"));
        t_m2.GuardMappingList.add(grdt_m2);

        t_m2.Delay = 1;
        pn.Transitions.add(t_m2);

        //3
        PetriTransition t_m3 = new PetriTransition(pn);
        t_m3.TransitionName = "t_m3";
        t_m3.InputPlaceName.add("p1EstExitBRMid");

        Condition t_m3ct1 = new Condition(t_m3, "p1EstExitBRMid", TransitionCondition.HaveCar);

        GuardMapping grdt_m3 = new GuardMapping();
        grdt_m3.condition = t_m3ct1;
        grdt_m3.Activations.add(new Activation(t_m3, "p1EstExitBRMid", TransitionOperation.PopElementWithoutTarget, "pca_in7"));
        t_m3.GuardMappingList.add(grdt_m3);

        t_m3.Delay = 1;
        pn.Transitions.add(t_m3);















        System.out.println("Lanes_Intersection started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }
}