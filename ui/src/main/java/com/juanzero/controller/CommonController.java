package com.juanzero.controller;

import com.juanzero.dao.domain.BookDO;
import com.juanzero.dao.persistence.BookDOMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

/**
 * @author huangyy
 * @description
 * @data 2017/02/19.
 */
@Controller
@RequestMapping("/v1")
public class CommonController {

    static final Logger logger = LogManager.getLogger(CommonController.class);

    @Autowired
    private BookDOMapper bookDOMapper;
//
//    @Autowired
//    private SysMapRegionManager sysMapRegionManager;

    @RequestMapping("/rate")
    public String product(Map<String, Object> model, Long id){
        logger.info("CommonController rate id = {}",id);
        model.put("list",null);

        //add
        BookDO bookDO = new BookDO();
        bookDO.setName("数学");
        bookDO.setPrice(100);
        bookDO.setTenantId("2001");
        bookDOMapper.insert(bookDO);
        logger.info("CommonController add a new book! id = {}",bookDO.getId());

        return "product_rate";
    }

    @RequestMapping("/map_01")
    public String map_01(Map<String, Object> model, Long id){
        logger.info("CommonController map_01 id = {}",id);

//        sysMapRegionManager.initSysMapRegionData();
        return "product_rate";
    }
}
