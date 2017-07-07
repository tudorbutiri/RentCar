package rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.dao.BookingDataDAO;
import rentcar.dao.BranchDataDAO;
import rentcar.data.BranchData;

import java.util.List;

@Service
public class BranchDataService {

    @Autowired
    BranchDataDAO branchDataDAO;

    public List<BranchData> getAllBranchData()
    {
        return branchDataDAO.getAllBranchData();
    }
}
