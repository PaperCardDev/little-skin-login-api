package cn.paper_card.little_skin_login.api;

import java.util.UUID;

public record BindingInfo(
        UUID mojangUuid,
        String name,
        UUID littleSkinUuid,
        String remark,
        long time
) {
}
