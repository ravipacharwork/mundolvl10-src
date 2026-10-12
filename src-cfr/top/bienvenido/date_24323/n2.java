/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.ComponentInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageParser$Component
 *  android.content.pm.SharedLibraryInfo
 *  kotlin.jvm.functions.Function1
 *  kotlin.text.StringsKt
 */
package top.bienvenido.date_24323;

import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.SharedLibraryInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import top.bienvenido.date_24323.ca;
import top.bienvenido.date_24323.e2;
import top.bienvenido.date_24323.f9;
import top.bienvenido.date_24323.o1;
import top.bienvenido.date_24323.p2;
import top.bienvenido.date_24323.\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1;

public final class n2 {
    public static final n2 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new n2();

    /*
     * Exception decompiling
     */
    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(e2 var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 39[TRYBLOCK] [39 : 606->611)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(ApplicationInfo applicationInfo) {
        if (\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988) {
            String[] stringArray;
            if (\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c) {
                String[] stringArray2 = new String[2];
                stringArray = stringArray2;
                stringArray2[0] = "/system/framework/org.apache.http.legacy.jar";
                stringArray2[1] = "/system/framework/android.test.base.jar";
            } else {
                String[] stringArray3 = new String[1];
                stringArray = stringArray3;
                stringArray3[0] = "/system/framework/org.apache.http.legacy.jar";
            }
            p2 p22 = f9.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
            List list = (List)p22.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(applicationInfo);
            if (list == null) {
                ArrayList arrayList;
                list = arrayList;
                arrayList = new ArrayList(stringArray.length);
                p22.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)applicationInfo, (Object)list);
            }
            for (String string : stringArray) {
                SharedLibraryInfo sharedLibraryInfo = (SharedLibraryInfo)ca.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.allocateInstance(SharedLibraryInfo.class);
                f9.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)sharedLibraryInfo, (Object)string);
                list.add(sharedLibraryInfo);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(ApplicationInfo applicationInfo, ApplicationInfo object) {
        String string;
        Object object2;
        block10: {
            block8: {
                block9: {
                    try {
                        object2 = object.dataDir;
                        applicationInfo.dataDir = object2;
                        if (\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988) {
                            applicationInfo.deviceProtectedDataDir = object2;
                            f9.\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)applicationInfo, object2);
                        }
                        if (\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u4f60\u5988\u4eca\u665a\u53bb\u5077\u7535\u7ebf\u6746\u5b50\u4f60\u7238\u53bb\u627e\u7535\u7bb1\u4e4b\u540e\u7ed3\u5408\u75af\u72c2\u7206\u7535\u8ba9\u540e\u5728\u62ff\u7535\u7ebf\u6746\u5b50ziwei\u5b8c\u4e8b\u8fd8\u8981\u53bb\u52a0\u6cb9\u7ad9\u5728\u81ea\u5df1piyan\u548c\u903c\u91cc\u704c\u6cb9\u62ff\u7740\u6253\u706b\u673a\u72c2\u64a9\u81ea\u5df1\u628a\u81ea\u5df1\u53d8\u6210\u5185\u71c3\u673a) {
                            applicationInfo.splitNames = object.splitNames;
                        }
                        if (\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f && (applicationInfo.flags & 0x8000000) != 0) {
                            object2 = 0;
                            f9.\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)applicationInfo, object2);
                        }
                        applicationInfo.sharedLibraryFiles = object.sharedLibraryFiles;
                        n2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(applicationInfo);
                        object2 = object.processName;
                        if (object2 == null) break block8;
                    }
                    catch (Exception exception) {
                        return;
                    }
                    if (((String)object2).length() != 0) break block9;
                    break block8;
                }
                string = object.processName;
                break block10;
            }
            string = applicationInfo.packageName;
        }
        object2 = string;
        Object object3 = object;
        Object object4 = object;
        applicationInfo.processName = object2;
        applicationInfo.nativeLibraryDir = object.nativeLibraryDir;
        applicationInfo.sourceDir = object.sourceDir;
        applicationInfo.publicSourceDir = object.publicSourceDir;
        p2 p22 = f9.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
        object2 = p22.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object);
        p22.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)applicationInfo, object2);
        p2 p23 = f9.\u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988;
        object2 = p23.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object);
        p23.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)applicationInfo, object2);
        p2 p24 = f9.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403;
        object = p24.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object);
        p24.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)applicationInfo, object);
        applicationInfo.splitSourceDirs = object4.splitSourceDirs;
        applicationInfo.splitPublicSourceDirs = object3.splitPublicSourceDirs;
    }

    public static int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String string) {
        int n10 = string.length();
        int n11 = 0;
        int n12 = 0;
        while (n12 < n10) {
            int n13 = n12++;
            n11 *= 31;
            n11 = n13 * 31 + n11;
            n11 = string.charAt(n13) * 31 + n11;
        }
        return Math.abs(n11);
    }

    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(ComponentInfo componentInfo, ApplicationInfo applicationInfo) {
        String string;
        if (componentInfo.packageName == null) {
            componentInfo.packageName = applicationInfo.packageName;
        }
        if ((string = componentInfo.processName) == null || string.length() == 0) {
            string = applicationInfo.processName;
            if (string == null || string.length() == 0) {
                string = applicationInfo.packageName;
            }
            componentInfo.processName = string;
        }
        componentInfo.applicationInfo = applicationInfo;
        string = componentInfo.name;
        if (string != null && StringsKt.startsWith$default((CharSequence)string, (char)'.', (boolean)false, (int)2, null)) {
            componentInfo.name = applicationInfo.packageName + componentInfo.name;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ComponentInfo[] \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(ArrayList iterator, o1 o12, ApplicationInfo applicationInfo, Function1 function1, Function1 function12) {
        ArrayList<ComponentInfo> arrayList;
        if (iterator.isEmpty()) {
            return null;
        }
        ArrayList<ComponentInfo> arrayList2 = arrayList;
        arrayList = new ArrayList<ComponentInfo>(iterator.size());
        try {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object = (PackageParser.Component)iterator.next();
                ComponentInfo componentInfo = (ComponentInfo)function1.invoke(object);
                n2.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(componentInfo, applicationInfo);
                componentInfo.metaData = ((PackageParser.Component)object).metaData;
                object = componentInfo.name;
                o12.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(((String)object).hashCode(), componentInfo);
                arrayList2.add(componentInfo);
            }
        }
        catch (Exception exception) {}
        {
            continue;
            return (ComponentInfo[])function12.invoke(arrayList2);
        }
        return (ComponentInfo[])function12.invoke(arrayList2);
    }

    public final PackageInfo \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(PackageInfo packageInfo, int n10) {
        long l10;
        PackageInfo packageInfo2;
        n2 n22 = packageInfo2;
        packageInfo2 = new PackageInfo();
        ((PackageInfo)n22).lastUpdateTime = l10 = packageInfo.lastUpdateTime;
        ((PackageInfo)n22).firstInstallTime = l10 = packageInfo.firstInstallTime;
        ((PackageInfo)n22).reqFeatures = packageInfo.reqFeatures;
        ((PackageInfo)n22).featureGroups = packageInfo.featureGroups;
        ((PackageInfo)n22).packageName = packageInfo.packageName;
        ((PackageInfo)n22).splitNames = packageInfo.splitNames;
        ((PackageInfo)n22).versionName = packageInfo.versionName;
        ((PackageInfo)n22).sharedUserId = packageInfo.sharedUserId;
        ((PackageInfo)n22).applicationInfo = packageInfo.applicationInfo;
        ((PackageInfo)n22).sharedUserLabel = packageInfo.sharedUserLabel;
        ((PackageInfo)n22).installLocation = packageInfo.installLocation;
        if (\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070) {
            ((PackageInfo)n22).baseRevisionCode = packageInfo.baseRevisionCode;
            ((PackageInfo)n22).splitRevisionCodes = packageInfo.splitRevisionCodes;
        }
        if (\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u4f60\u4e0d\u77e5\u9053\u4f60\u5988\u5f20\u4e2a\u5927\u5634\u5288\u4e2a\u5c0f\u817f\u4e0b\u9762\u8fd8\u6d41\u7740\u54b8\u76d0\u6c34\u5417\u5f1f\u5f1f) {
            l10 = packageInfo.getLongVersionCode();
            n22.setLongVersionCode(l10);
            if ((n10 & 0x8000000) != 0) {
                ((PackageInfo)n22).signingInfo = packageInfo.signingInfo;
            }
        } else {
            ((PackageInfo)n22).versionCode = packageInfo.versionCode;
        }
        if (\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u8001\u5b50\u5b9e\u5728\u770b\u4e0d\u8fc7\u4f60\u5988\u7684\u8111\u6b8b\u72d7\u903c\u6837\u5b50\u76f4\u63a5\u628a\u4f60\u5988\u75285\u6bdb\u94b1\u5356\u5230\u57c3\u585e\u4fc4\u6bd4\u4e9a\u56fd\u5bb6\u5927\u5993\u9662\u8bf7\u90a3\u4e9b\u975e\u6d32\u90e8\u843d\u5c0f\u55bd\u5570\u6765\u4eab\u53d7\u4f60\u5988\u903c\u7684\u9ed1\u9634\u903c) {
            ((PackageInfo)n22).attributions = packageInfo.attributions;
        }
        if ((n10 & 1) != 0) {
            ((PackageInfo)n22).activities = packageInfo.activities;
        }
        if ((n10 & 2) != 0) {
            ((PackageInfo)n22).receivers = packageInfo.receivers;
        }
        if ((n10 & 8) != 0) {
            ((PackageInfo)n22).providers = packageInfo.providers;
        }
        if ((n10 & 4) != 0) {
            ((PackageInfo)n22).services = packageInfo.services;
        }
        if ((n10 & 0x1000) != 0) {
            ((PackageInfo)n22).permissions = packageInfo.permissions;
            ((PackageInfo)n22).requestedPermissions = packageInfo.requestedPermissions;
            ((PackageInfo)n22).requestedPermissionsFlags = packageInfo.requestedPermissionsFlags;
        }
        if ((n10 & 0x4000) != 0) {
            ((PackageInfo)n22).configPreferences = packageInfo.configPreferences;
        }
        if ((n10 & 0x10) != 0) {
            ((PackageInfo)n22).instrumentation = packageInfo.instrumentation;
        }
        if ((n10 & 0x100) != 0) {
            ((PackageInfo)n22).gids = packageInfo.gids;
        }
        if ((n10 & 0x40) != 0) {
            ((PackageInfo)n22).signatures = packageInfo.signatures;
            return n22;
        }
        return n22;
    }
}

