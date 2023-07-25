package com.zlht.pose.management.api.service;

import com.zlht.pose.management.api.utils.Result;
import com.zlht.pose.management.dao.entity.Institution;

public interface InstitutionServicesI {

    /**
     * 查询机构
     *
     * @param type
     * @param pageNum
     * @param pageSize
     * @return
     */
    Result<Institution> queryInstitutionList(int type, int pageNum, int pageSize, String name);

    /**
     * 创建机构
     *
     * @param Institution
     * @return
     */

    Result<Institution> createInstitution(Institution Institution);

    /**
     * 更新机构
     *
     * @param id
     * @param Institution
     * @return
     */
    Result<Institution> updateInstitution(int id, Institution Institution);

    /**
     * 删除机构
     *
     * @param id
     * @return
     */
    Result<Institution> deleteInstitution(int id);


    boolean checkInstitutionExist(Institution Institution);
}
