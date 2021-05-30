package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAllSorted();
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	
	
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	//Ayşe gelsin
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	//Ayşe ve ahmet gelsin
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	//Ayşe veya ahmet gelsin
	
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	//Sadece söylediğim kategori id'leri getir
	
	DataResult<List<Product>> getByProductNameContains(String name);
	//Kategori isminin içinde geçiyorsa/içeriyorsa getir
	
	DataResult<List<Product>> getByProductNameStartsWith(String name);
	//...... isinmle başlayan kategori ismini getir
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

}
