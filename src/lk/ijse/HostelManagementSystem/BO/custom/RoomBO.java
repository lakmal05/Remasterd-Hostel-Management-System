package lk.ijse.HostelManagementSystem.BO.custom;

import lk.ijse.HostelManagementSystem.BO.SuperBO;
import lk.ijse.HostelManagementSystem.dto.RoomDTO;

import java.util.List;

public interface RoomBO extends SuperBO {
    List<RoomDTO> getAllRooms() throws Exception;

    boolean addRoom(RoomDTO roomDTO) throws Exception;

    boolean updateRoom(RoomDTO roomDTO) throws Exception;

    boolean deleteRoom(String id) throws Exception;

    boolean roomExist(String id) throws Exception;
}
