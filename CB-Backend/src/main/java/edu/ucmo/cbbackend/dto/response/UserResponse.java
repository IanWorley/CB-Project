package edu.ucmo.cbbackend.dto.response;

import edu.ucmo.cbbackend.model.ChangeRequest;
import edu.ucmo.cbbackend.model.Roles;
import edu.ucmo.cbbackend.model.User;

import java.util.List;

public class UserResponse {
    private Long id;
    private String Username;
    private Roles role;
    private List<Long> changeRequestsId;

    public UserResponse(User user) {
        this.id = user.getId();
        this.Username = user.getUsername();
        this.role = user.getRoles();
        this.changeRequestsId = user.getChangeRequests().stream().map(
                ChangeRequest::getId).toList();
    }


    public UserResponse(Long id, String Username, Roles role, List<Long> changeRequestsId) {
        this.id = id;
        this.Username = Username;
        this.role = role;
        this.changeRequestsId = changeRequestsId;
    }

    public UserResponse() {
    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.Username;
    }

    public Roles getRole() {
        return this.role;
    }

    public List<Long> getChangeRequestsId() {
        return this.changeRequestsId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public void setChangeRequestsId(List<Long> changeRequestsId) {
        this.changeRequestsId = changeRequestsId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserResponse)) return false;
        final UserResponse other = (UserResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$Username = this.getUsername();
        final Object other$Username = other.getUsername();
        if (this$Username == null ? other$Username != null : !this$Username.equals(other$Username)) return false;
        final Object this$role = this.getRole();
        final Object other$role = other.getRole();
        if (this$role == null ? other$role != null : !this$role.equals(other$role)) return false;
        final Object this$changeRequestsId = this.getChangeRequestsId();
        final Object other$changeRequestsId = other.getChangeRequestsId();
        if (this$changeRequestsId == null ? other$changeRequestsId != null : !this$changeRequestsId.equals(other$changeRequestsId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $Username = this.getUsername();
        result = result * PRIME + ($Username == null ? 43 : $Username.hashCode());
        final Object $role = this.getRole();
        result = result * PRIME + ($role == null ? 43 : $role.hashCode());
        final Object $changeRequestsId = this.getChangeRequestsId();
        result = result * PRIME + ($changeRequestsId == null ? 43 : $changeRequestsId.hashCode());
        return result;
    }

    public String toString() {
        return "UserResponse(id=" + this.getId() + ", Username=" + this.getUsername() + ", role=" + this.getRole() + ", changeRequestsId=" + this.getChangeRequestsId() + ")";
    }
}
