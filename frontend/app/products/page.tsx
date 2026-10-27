import { getProducts } from "../../features/products/services/productService";

export const instant = false;

export default async function ProductsPage() {
  const products = await getProducts();

  return (
    <main className="mx-auto max-w-5xl p-8">
      <h1 className="mb-6 text-3xl font-bold">Products</h1>

      <div className="grid gap-6 sm:grid-cols-2 lg:grid-cols-3">
        {products.map((product) => (
          <article
            key={product.id}
            className="rounded-xl border p-5 shadow-sm"
          >
            <h2 className="text-lg font-semibold">{product.name}</h2>
            <p className="mt-2">${product.price}</p>
          </article>
        ))}
      </div>
    </main>
  );
}