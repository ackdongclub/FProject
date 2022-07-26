package Pkg.Admin.CartsDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Pkg.Admin.CartsDTO.CartListDTO;

@Repository
public class CartListDAOImpl implements CartListDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<CartListDTO> getCartList(String usingId, String cIdx) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("usingId", usingId);
		map.put("cIdx", cIdx);
		
		sqlSession.selectList("selCartList", map);
		
		List<CartListDTO> cartList = (List<CartListDTO>)map.get("result");
		
		return cartList;
	}


	@Override
	public Map<String, ArrayList<String>> delCartList(String[] cIdx) {
		
		Map<String, ArrayList<String>> errMap = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> arrErrCode = new ArrayList<String>();
		ArrayList<String> arrErrMsg = new ArrayList<String>();
		
		for(int i = 0; i < cIdx.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("cIdx", cIdx[i]);
			
			sqlSession.selectList("delCartList", map);
			
			arrErrCode.add((String)map.get("errCode"));
			arrErrMsg.add((String)map.get("errMsg"));
		}
		
		errMap.put("errCode", arrErrCode);
		errMap.put("errMsg", arrErrMsg);
		
		return errMap;
	}

}
