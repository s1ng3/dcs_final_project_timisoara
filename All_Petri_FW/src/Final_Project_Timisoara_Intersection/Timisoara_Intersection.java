package Final_Project_Timisoara_Intersection;

import Components.PetriNet;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;

public class Timisoara_Intersection {

    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Lanes";
        pn.SetName("Lanes");
        pn.NetworkPort = 1081;

        // ---- Vasile Goldis----

        DataCar p1 = new DataCar();
        p1.SetName("p1");
        pn.PlaceList.add(p1);

        DataCarQueue p2 = new DataCarQueue();
        p2.Value.Size = 3;
        p2.SetName("p2");
        pn.PlaceList.add(p2);

        DataCar p3 = new DataCar();
        p3.SetName("p3");
        pn.PlaceList.add(p3);

        DataString p4 = new DataString();
        p4.SetName("Pedestrians");
        pn.PlaceList.add(p4);

        DataString p5 = new DataString();
        p5.SetName("UserReqVG");
        pn.PlaceList.add(p5);

        DataString p6 = new DataString();
        p6.SetName("Sem1");
        pn.PlaceList.add(p6);

        DataTransfer OPReq = new DataTransfer();
        OPReq.SetName("OPReq");
        OPReq.Value = new TransferOperation("localhost", "1081" , "UserReq");
        pn.PlaceList.add(OPReq);

        // ---- Bulevardul Mihai Eminescu ----

        DataCar p7 = new DataCar();
        p7.SetName("p7");
        pn.PlaceList.add(p7);

        DataCar p8 = new DataCar();
        p8.SetName("p8");
        pn.PlaceList.add(p8);

        // ----

    }
}
