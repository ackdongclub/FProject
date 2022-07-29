package Pkg.Admin.CartsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Pkg.Admin.CartsDTO.CartListDTO;

public interface CartService {
	
	public List<CartListDTO> getCartList(String usingId, String cIdx);
	
	public Map<String, ArrayList<String>> delCartList(String[] cIdx);

}
