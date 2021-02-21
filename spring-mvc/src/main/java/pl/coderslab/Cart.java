package pl.coderslab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(
	value = WebApplicationContext.SCOPE_SESSION,
	proxyMode = ScopedProxyMode.TARGET_CLASS
)
public class Cart {
	private static final Logger logger = LoggerFactory.getLogger(Cart.class);

	private final List<CartItem> cartItems = new ArrayList<>();

	public void addToCart(CartItem cartItem) {
		cartItems.add(cartItem);
		logger.info("Dodano do koszyka: " + cartItem);
	}

	public String getAllCartItemsDescription() {
		return cartItems.stream()
				.map(CartItem::toString)
				.collect(Collectors.joining(" | "));
	}
}
