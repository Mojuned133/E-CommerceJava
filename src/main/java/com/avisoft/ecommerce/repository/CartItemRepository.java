package com.avisoft.ecommerce.repository;

import com.avisoft.ecommerce.model.Cart;
import com.avisoft.ecommerce.model.CartItem;
import com.avisoft.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartItemRepository  extends JpaRepository<CartItem,Long> {

//    @Query("SELECT ci From CartItem ci Where ci.cart And ci.product And ci.size=size And ci.userId=:userId")
//    public CartItem isCartItemExist(@Param("cart")Cart cart, @Param("product")Product product,@Param("size")String size,
//                                    @Param("userId")Long userId);


    @Query("SELECT ci FROM CartItem ci WHERE ci.cart = :cart AND ci.product = :product AND ci.size = :size AND ci.userId = :userId")
    public CartItem isCartItemExist(@Param("cart") Cart cart, @Param("product") Product product, @Param("size") String size, @Param("userId") Long userId);

}
