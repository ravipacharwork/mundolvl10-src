/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityClient
 *  android.app.ActivityTaskManager
 *  android.app.ActivityThread$ActivityClientRecord
 *  android.content.Intent
 *  android.os.IBinder
 *  kotlin.jvm.internal.Intrinsics
 */
package top.bienvenido.date_24323;

import android.app.ActivityClient;
import android.app.ActivityTaskManager;
import android.app.ActivityThread;
import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.date_24323.d2;
import top.bienvenido.date_24323.f4;
import top.bienvenido.date_24323.f9;
import top.bienvenido.date_24323.h6;
import top.bienvenido.date_24323.\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1;

public final class z6
extends d2 {
    public static final z6 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new z6();

    /*
     * WARNING - bad return control flow
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Object object, Method method, Object[] objectArray) {
        boolean bl;
        block16: {
            try {
                Object object2 = objectArray[0];
            }
            catch (Throwable throwable) {}
            if (!f4.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070) return method.invoke(object, objectArray);
            if (!(object2 instanceof IBinder)) return method.invoke(object, objectArray);
            h6.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.getClass();
            ActivityThread.ActivityClientRecord activityClientRecord = h6.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988.getActivityClient((IBinder)object2);
            if (activityClientRecord == null) return method.invoke(object, objectArray);
            activityClientRecord = (Intent)f9.\u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(activityClientRecord);
            if (activityClientRecord == null) return method.invoke(object, objectArray);
            if (!Intrinsics.areEqual((Object)"android.intent.action.MAIN", (Object)activityClientRecord.getAction())) return method.invoke(object, objectArray);
            if (!activityClientRecord.hasCategory("android.intent.category.LAUNCHER")) return method.invoke(object, objectArray);
            if (activityClientRecord.getCategories().size() != 1) return method.invoke(object, objectArray);
            if (activityClientRecord.getData() != null) return method.invoke(object, objectArray);
            if (activityClientRecord.getType() != null) return method.invoke(object, objectArray);
            if (!\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u8001\u5b50\u5b9e\u5728\u770b\u4e0d\u8fc7\u4f60\u5988\u7684\u8111\u6b8b\u72d7\u903c\u6837\u5b50\u76f4\u63a5\u628a\u4f60\u5988\u75285\u6bdb\u94b1\u5356\u5230\u57c3\u585e\u4fc4\u6bd4\u4e9a\u56fd\u5bb6\u5927\u5993\u9662\u8bf7\u90a3\u4e9b\u975e\u6d32\u90e8\u843d\u5c0f\u55bd\u5570\u6765\u4eab\u53d7\u4f60\u5988\u903c\u7684\u9ed1\u9634\u903c) break block16;
            bl = ActivityClient.getInstance().moveActivityTaskToBack((IBinder)object2, false);
            return null;
        }
        bl = ActivityTaskManager.getService().moveActivityTaskToBack((IBinder)object2, false);
        return null;
        return method.invoke(object, objectArray);
    }
}

