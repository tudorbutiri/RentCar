package rentcar.dao;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rentcar.data.BookingData;
import rentcar.data.BranchData;
import rentcar.data.CarData;

import java.util.List;

@Repository("branchDataDAO")
@Transactional
public class BranchDataDAO {

    private static final Logger logger = LoggerFactory.getLogger(BranchDataDAO.class);

    @Autowired
    private HibernateTemplate hibernateTemplate;

    private Session getSession() {
        return hibernateTemplate.getSessionFactory().getCurrentSession();
    }

    public List<BranchData> getAllBranchData()
    {
        Session session = getSession();
        Criteria criteria = session.createCriteria(BranchData.class);
        List<BranchData> allBranches = criteria.list();
        logger.info("Retrieved multiple objects, BookingData, in the specified interval");
        return allBranches;
    }

}
