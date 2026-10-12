/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.IAccountAuthenticator
 *  android.accounts.IAccountAuthenticatorResponse
 *  android.accounts.IAccountManagerResponse
 */
package top.bienvenido.date_24323;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import top.bienvenido.date_24323.c9;

public final class g3
extends c9 {
    public g3(String string, boolean bl, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, string, bl, true, null, false, false);
    }

    @Override
    public final void \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6() {
        IAccountAuthenticator iAccountAuthenticator = this.\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.editProperties((IAccountAuthenticatorResponse)this, this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070);
            return;
        }
    }
}

