package in.example.search.services;

import java.io.IOException;

import in.example.model.CreateProductRequest;

public interface ProductSearchService {

	public void createProductSet(String productSetId, String productSetDisplayName);

	public void createProduct(CreateProductRequest createProductRequest);

	public void addProductToProductSet(String productId, String productSetId);

	public void updateProductLabels(String productId, String productLabels);

	public void createReferenceImage(String productId, String referenceImageId, String gcsUri);

	public void getSimilarProductsFile(String productSetId, String productCategory, String filePath,String filter);
}
