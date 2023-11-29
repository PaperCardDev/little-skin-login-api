package cn.paper_card.little_skin_login.api;

import java.util.UUID;

public record BindingCodeInfo(
        int code,
        UUID uuid,
        String name,
        long time
) {
}
