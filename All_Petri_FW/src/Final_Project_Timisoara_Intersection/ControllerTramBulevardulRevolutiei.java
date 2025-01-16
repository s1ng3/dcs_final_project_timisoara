package Final_Project_Timisoara_Intersection;

import Components.*;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class ControllerTramBulevardulRevolutiei {


        public static void main(String[] args) {

            PetriNet pn = new PetriNet();
            pn.PetriNetName = "Controller";
            pn.SetName("Controller");
            pn.NetworkPort = 1081;

            // Define constants
            DataString ini = new DataString();
            ini.SetName("ini");
            ini.SetValue("red");
            pn.ConstantPlaceList.add(ini);

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

            // Define places
            DataString p1 = new DataString();
            p1.SetName("r1r2");
            p1.SetValue("signal");
            pn.PlaceList.add(p1);

            DataString p2 = new DataString();
            p2.SetName("g1r2");
            pn.PlaceList.add(p2);

            DataString p3 = new DataString();
            p3.SetName("y1r2");
            pn.PlaceList.add(p3);

            DataString p4 = new DataString();
            p4.SetName("r1g2");
            pn.PlaceList.add(p4);

            DataString p5 = new DataString();
            p5.SetName("r1y2");
            pn.PlaceList.add(p5);


            // Define output places
            DataTransfer p10 = new DataTransfer();
            p10.SetName("OP1");
            p10.Value = new TransferOperation("localhost", "1080", "Sem1");
            pn.PlaceList.add(p10);

            DataTransfer p11 = new DataTransfer();
            p11.SetName("OP2");
            p11.Value = new TransferOperation("localhost", "1080", "Sem2Br");
            pn.PlaceList.add(p11);


            // adding new places for project 4
/*
            DataString in1  = new DataString();
            in1.SetName("in1");
            pn.PlaceList.add(in1);

            DataString in2  = new DataString();
            in2.SetName("in2");
            pn.PlaceList.add(in2);

            DataString in3  = new DataString();
            in3.SetName("in3");
            pn.PlaceList.add(in3);

            DataString in4  = new DataString();
            in4.SetName("in4");
            pn.PlaceList.add(in4);

            DataString P_f1 = new DataString();
            P_f1.SetName("P_f1");
            pn.PlaceList.add(P_f1);

            DataString P_f2 = new DataString();
            P_f2.SetName("P_f2");
            pn.PlaceList.add(P_f2);

            DataString P_f3 = new DataString();
            P_f3.SetName("P_f3");
            pn.PlaceList.add(P_f3);

            DataString P_f4 = new DataString();
            P_f4.SetName("P_f4");
            pn.PlaceList.add(P_f4);

            DataInteger Five = new DataInteger();
            Five.SetName("Five");
            Five.SetValue(5);
            pn.ConstantPlaceList.add(Five);

            DataInteger Ten = new DataInteger();
            Five.SetName("Ten");
            Five.SetValue(10);
            pn.ConstantPlaceList.add(Ten);


 */

            //end

            // Define transitions
            PetriTransition iniT = new PetriTransition(pn);
            iniT.TransitionName = "iniT";

            Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);
            GuardMapping grdiniT = new GuardMapping();
            grdiniT.condition = iniTCt1;

            grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP1"));
            grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP2"));
            grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));

            iniT.GuardMappingList.add(grdiniT);
            iniT.Delay = 0;
            pn.Transitions.add(iniT);


            // ---------------------------- T1 ------------------------------------
            PetriTransition t1 = new PetriTransition(pn);
            t1.TransitionName = "T1";
            t1.InputPlaceName.add("r1r2");

            Condition T1Ct1 = new Condition(t1, "r1r2", TransitionCondition.NotNull);
            GuardMapping grdT1 = new GuardMapping();
            grdT1.condition = T1Ct1;
            grdT1.Activations.add(new Activation(t1, "r1r2", TransitionOperation.Move, "g1r2"));
            grdT1.Activations.add(new Activation(t1, "green", TransitionOperation.SendOverNetwork, "OP1"));

            //grdT1.Activations.add(new Activation(t1, "r1r2", TransitionOperation.Move, "P_f1"));
            t1.GuardMappingList.add(grdT1);

            t1.Delay = 5;
            pn.Transitions.add(t1);

            // ---------------------------- T2 ------------------------------------
            PetriTransition t2 = new PetriTransition(pn);
            t2.TransitionName = "T2";
            t2.InputPlaceName.add("g1r2");

            Condition T2Ct1 = new Condition(t2, "g1r2", TransitionCondition.NotNull);
            GuardMapping grdT2 = new GuardMapping();
            grdT2.condition = T2Ct1;
            grdT2.Activations.add(new Activation(t2, "g1r2", TransitionOperation.Move, "y1r2"));
            grdT2.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP1"));

            t2.GuardMappingList.add(grdT2);

            t2.Delay = 5;
            pn.Transitions.add(t2);

            // ---------------------------- T3 ------------------------------------
            PetriTransition t3 = new PetriTransition(pn);
            t3.TransitionName = "T3";
            t3.InputPlaceName.add("y1r2");

            Condition T3Ct1 = new Condition(t3, "y1r2", TransitionCondition.NotNull);
            GuardMapping grdT3 = new GuardMapping();
            grdT3.condition = T3Ct1;
            grdT3.Activations.add(new Activation(t3, "y1r2", TransitionOperation.Move, "r1g2"));
            grdT3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "OP1"));
            grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.SendOverNetwork, "OP2"));

            // grdT3.Activations.add(new Activation(t3, "y1r2", TransitionOperation.Move, "P_f2"));
            t3.GuardMappingList.add(grdT3);

            t3.Delay = 5;
            pn.Transitions.add(t3);

            // ---------------------------- T4 ------------------------------------
            PetriTransition t4 = new PetriTransition(pn);
            t4.TransitionName = "T4";
            t4.InputPlaceName.add("r1g2");

            Condition T4Ct1 = new Condition(t4, "r1g2", TransitionCondition.NotNull);
            GuardMapping grdT4 = new GuardMapping();
            grdT4.condition = T4Ct1;
            grdT4.Activations.add(new Activation(t4, "r1g2", TransitionOperation.Move, "r1y2"));
            grdT4.Activations.add(new Activation(t4, "yellow", TransitionOperation.SendOverNetwork, "OP2"));
            t4.GuardMappingList.add(grdT4);

            t4.Delay = 5;
            pn.Transitions.add(t4);

            // ---------------------------- T5 ------------------------------------

            PetriTransition t5 = new PetriTransition(pn);
            t5.TransitionName = "T5";
            t5.InputPlaceName.add("r1y2");

            Condition T5Ct1 = new Condition(t5, "r1y2", TransitionCondition.NotNull);
            GuardMapping grdT5 = new GuardMapping();
            grdT5.condition = T5Ct1;
            grdT5.Activations.add(new Activation(t5, "r1r2", TransitionOperation.Move, "r1r2"));
            grdT5.Activations.add(new Activation(t5, "red", TransitionOperation.SendOverNetwork, "OP2"));
            t5.GuardMappingList.add(grdT5);

            t5.Delay = 5;
            pn.Transitions.add(t5);

            /*
            // ----------------------------------------------------------------------
            // -----------------------new transitions added--------------------------
            // ------------------------------for proj 4------------------------------
            // ----------------------------------------------------------------------

            // ---------------------------- T_f1 ------------------------------------
            PetriTransition t_f1 = new PetriTransition(pn);
            t_f1.TransitionName = "T_f1";
            t_f1.InputPlaceName.add("P_f1");
            t_f1.InputPlaceName.add("in1");
            t_f1.IsAsync = true;

            // ------------------------guard 1----------------------------
            Condition T_f1Ct1 = new Condition(t_f1, "P_f1", TransitionCondition.NotNull);
            Condition T_f1Ct2 = new Condition(t_f1, "in1", TransitionCondition.IsNull);
            T_f1Ct1.SetNextCondition(LogicConnector.AND, T_f1Ct2);

            GuardMapping grdT_f1 = new GuardMapping();
            grdT_f1.condition = T_f1Ct1;
            grdT_f1.Activations.add(new Activation(t2, "Five", TransitionOperation.DynamicDelay, ""));
            t_f1.GuardMappingList.add(grdT_f1);

            // ------------------------guard 2----------------------------
            Condition T_f1Ct3 = new Condition(t_f1, "in1", TransitionCondition.NotNull);
            T_f1Ct1.SetNextCondition(LogicConnector.AND, T_f1Ct3);

            GuardMapping grdT_f12 = new GuardMapping();
            grdT_f12.condition = T_f1Ct1;
            grdT_f12.Activations.add(new Activation(t2, "Ten", TransitionOperation.DynamicDelay, ""));
            t_f1.GuardMappingList.add(grdT_f12);

            t_f1.Delay = 5;
            pn.Transitions.add(t_f1);

            // ---------------------------- T_f2 ------------------------------------
            PetriTransition t_f2 = new PetriTransition(pn);
            t_f2.TransitionName = "T_f2";
            t_f2.InputPlaceName.add("P_f2");
            t_f2.InputPlaceName.add("in2");
            t_f2.IsAsync = true;

            // ------------------------guard 1----------------------------
            Condition T_f2Ct1 = new Condition(t_f2, "P_f2", TransitionCondition.NotNull);
            Condition T_f2Ct2 = new Condition(t_f2, "in2", TransitionCondition.IsNull);
            T_f2Ct1.SetNextCondition(LogicConnector.AND, T_f2Ct2);

            GuardMapping grdT_f2 = new GuardMapping();
            grdT_f2.condition = T_f2Ct1;
            grdT_f2.Activations.add(new Activation(t4, "Five", TransitionOperation.DynamicDelay, ""));
            t_f2.GuardMappingList.add(grdT_f2);

            // ------------------------guard 2----------------------------
            Condition T_f2Ct3 = new Condition(t_f2, "in2", TransitionCondition.NotNull);
            T_f2Ct1.SetNextCondition(LogicConnector.AND, T_f2Ct3);

            GuardMapping grdT_f22 = new GuardMapping();
            grdT_f22.condition = T_f2Ct1;
            grdT_f22.Activations.add(new Activation(t4, "Ten", TransitionOperation.DynamicDelay, ""));
            t_f2.GuardMappingList.add(grdT_f22);

            t_f2.Delay = 5;
            pn.Transitions.add(t_f2);

            // ---------------------------- T_f3 ------------------------------------
            PetriTransition t_f3 = new PetriTransition(pn);
            t_f3.TransitionName = "T_f3";
            t_f3.InputPlaceName.add("P_f3");
            t_f3.InputPlaceName.add("in3");
            t_f3.IsAsync = true;

            // ------------------------guard 1----------------------------
            Condition T_f3Ct1 = new Condition(t_f3, "P_f3", TransitionCondition.NotNull);
            Condition T_f3Ct2 = new Condition(t_f3, "in3", TransitionCondition.IsNull);
            T_f3Ct1.SetNextCondition(LogicConnector.AND, T_f3Ct2);

            GuardMapping grdT_f3 = new GuardMapping();
            grdT_f3.condition = T_f3Ct1;
            grdT_f3.Activations.add(new Activation(t6, "Five", TransitionOperation.DynamicDelay, ""));
            t_f3.GuardMappingList.add(grdT_f3);

            // ------------------------guard 2----------------------------
            Condition T_f3Ct3 = new Condition(t_f3, "in3", TransitionCondition.NotNull);
            T_f3Ct1.SetNextCondition(LogicConnector.AND, T_f3Ct3);

            GuardMapping grdT_f32 = new GuardMapping();
            grdT_f32.condition = T_f3Ct1;
            grdT_f32.Activations.add(new Activation(t6, "Ten", TransitionOperation.DynamicDelay, ""));
            t_f3.GuardMappingList.add(grdT_f32);

            t_f3.Delay = 5;
            pn.Transitions.add(t_f3);

            // ---------------------------- T_f4 ------------------------------------
            PetriTransition t_f4 = new PetriTransition(pn);
            t_f4.TransitionName = "T_f4";
            t_f4.InputPlaceName.add("P_f4");
            t_f4.InputPlaceName.add("in4");
            t_f4.IsAsync = true;

            // ------------------------guard 1----------------------------
            Condition T_f4Ct1 = new Condition(t_f4, "P_f4", TransitionCondition.NotNull);
            Condition T_f4Ct2 = new Condition(t_f4, "in4", TransitionCondition.IsNull);
            T_f4Ct1.SetNextCondition(LogicConnector.AND, T_f4Ct2);

            GuardMapping grdT_f4 = new GuardMapping();
            grdT_f4.condition = T_f4Ct1;
            grdT_f4.Activations.add(new Activation(t8, "Five", TransitionOperation.DynamicDelay, ""));
            t_f4.GuardMappingList.add(grdT_f4);

            // ------------------------guard 2----------------------------
            Condition T_f4Ct3 = new Condition(t_f4, "in4", TransitionCondition.NotNull);
            T_f4Ct1.SetNextCondition(LogicConnector.AND, T_f4Ct3);

            GuardMapping grdT_f42 = new GuardMapping();
            grdT_f42.condition = T_f4Ct1;
            grdT_f42.Activations.add(new Activation(t8, "Ten", TransitionOperation.DynamicDelay, ""));
            t_f4.GuardMappingList.add(grdT_f42);

            t_f4.Delay = 5;
            pn.Transitions.add(t_f4);

            // ----------------------------------------------------------------------
            // -------------------------------end------------------------------------
            // ----------------------------------------------------------------------
            // ----------------------------------------------------------------------

             */

            PetriNetWindow frame = new PetriNetWindow(false);
            frame.petriNet = pn;
            frame.setVisible(true);
        }
    }




