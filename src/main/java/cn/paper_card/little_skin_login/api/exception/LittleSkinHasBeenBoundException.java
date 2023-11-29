package cn.paper_card.little_skin_login.api.exception;

import cn.paper_card.little_skin_login.api.BindingInfo;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class LittleSkinHasBeenBoundException extends Exception {

    private final @NotNull BindingInfo bindingInfo;
    
    public LittleSkinHasBeenBoundException(@NotNull BindingInfo bindingInfo, @NotNull String message) {
        super(message);
        this.bindingInfo = bindingInfo;
    }

    public @NotNull BindingInfo getBindingInfo() {
        return this.bindingInfo;
    }
}
