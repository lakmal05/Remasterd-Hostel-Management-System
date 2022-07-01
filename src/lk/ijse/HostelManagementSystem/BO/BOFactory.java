package lk.ijse.HostelManagementSystem.BO;

import lk.ijse.HostelManagementSystem.BO.custom.impl.*;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getBoFactory(){
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes{
        STUDENT, ROOM, RESERVATION,USER,SEARCHREGISTRATION
    }

    public SuperBO getBO(BOTypes types){
        switch (types){
            case STUDENT:
                return new StudentBOImpl();
            case ROOM:
                return new RoomBOImpl();
            case RESERVATION:
                return new ReservationBOImpl();
            case USER:
                return new UserBOImpl();
            case SEARCHREGISTRATION:
                return new SearchRegistrationBOImpl();
            default:
                return null;
        }
    }
}
