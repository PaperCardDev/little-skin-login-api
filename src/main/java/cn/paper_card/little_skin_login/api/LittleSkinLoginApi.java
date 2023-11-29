package cn.paper_card.little_skin_login.api;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@SuppressWarnings("unused")
public interface LittleSkinLoginApi {

    @NotNull BindingService getBindingService();

    @NotNull BindingCodeService getBindingCodeService();

    void onPreLoginCheckNotBind(@NotNull Object event);
    
    @NotNull Object getSessionService();

    @Nullable String onMainGroupMessage(@NotNull String message, long senderQq);
}
