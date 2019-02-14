package in.example.search.services;

import java.io.IOException;

public interface ProductSearchService {

	public void createProductSet(String productSetId, String productSetDisplayName);

	public void createProduct(String productId, String productDisplayName, String productCategory) throws IOException;

	public void addProductToProductSet(String productId, String productSetId) throws IOException;

	public void updateProductLabels(String productId, String productLabels) throws IOException;

	public void createReferenceImage(String productId, String referenceImageId, String gcsUri) throws IOException;

	public void getSimilarProductsFile(String productSetId, String productCategory, String filePath,String filter) throws IOException;
}
