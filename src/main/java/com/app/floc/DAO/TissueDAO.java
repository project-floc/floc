package com.app.floc.DAO;


import com.app.floc.domain.DTO.MyPloggingPagination;
import com.app.floc.domain.DTO.Search;
import com.app.floc.domain.VO.TissueVO;
import com.app.floc.mapper.TissueMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TissueDAO {
    private final TissueMapper tissueMapper;

    //    포인트 목록
    public List<TissueVO> findAll(MyPloggingPagination myPloggingPagination, Search search){
        return tissueMapper.selectAll(myPloggingPagination, search);
    }

    //    포인트 추가
    public void save(TissueVO tissueVO){
        tissueMapper.insert(tissueVO);
    }




    //상품 구매로 인한 티슈 히스토리
    public void buyProductHistory(TissueVO tissueVO){
        tissueMapper.insertByBuyProduct(tissueVO);
    }

}
